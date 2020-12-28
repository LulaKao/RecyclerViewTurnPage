package com.quarterlife.recyclerviewturnpagetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>  {
    private Context context;
    private List<ItemModel> itemList;

    //========= ItemAdapter START =========//
    public ItemAdapter(Context context, List<ItemModel> itemList) {
        this.context = context;
        this.itemList = itemList;
    }
    //========= ItemAdapter END =========//

    //========= onCreateViewHolder START =========//
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
    }
    //========= onCreateViewHolder END =========//

    //========= mViewHolder START =========//
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView user_img;
        private TextView user_name, user_price, user_stock;
        private CardView user_container;
        private int position;

        public ViewHolder(View itemView) {
            super(itemView);

            // 初始化 View
            user_img = itemView.findViewById(R.id.item_img);
//            user_name = itemView.findViewById(R.id.item_name);
            user_container = itemView.findViewById(R.id.item_container);
//            user_price = itemView.findViewById(R.id.item_price);
//            user_stock = itemView.findViewById(R.id.item_stock);

            // 初始化點擊事件
            user_container.setOnClickListener(this);
        }

        //========= 點擊事件 START =========//
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.item_container) { // user_container
                Toast.makeText(context, "position = " + position + " / user_id = " + itemList.get(position).getUser_id(), Toast.LENGTH_SHORT).show();
            }
        }
        //========= 點擊事件 END =========//
    }
    //========= mViewHolder END =========//

    //========= onBindViewHolder START =========//
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.user_name.setText(itemList.get(position).getUser_name());
//        holder.user_price.setText(String.valueOf(itemList.get(position).getUser_price()));
//        holder.user_stock.setText(String.valueOf(itemList.get(position).getUser_stock()));
        holder.user_img.setImageResource(itemList.get(position).getUser_img());

        holder.position = position; // 紀錄項目位置
    }
    //========= onBindViewHolder END =========//

    //========= getItemCount START =========//
    @Override
    public int getItemCount() {
        return itemList.size();
    }
    //========= getItemCount END =========//
}
