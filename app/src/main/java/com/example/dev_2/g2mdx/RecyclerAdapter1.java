package com.example.dev_2.g2mdx;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dev_2.g2mdx.dummy.DummyContent;

import java.util.List;

public class RecyclerAdapter1 extends
        RecyclerView.Adapter<RecyclerAdapter1.ViewHolder> {
    private String[] titles = {"ERP  ",
            "CRM",
            "WorkForce Automation",
            "Mobile applications",
            "GIS solutions",
            "WorkForce Automation",
            "Mobile applications"};
    private String[] details = {"Odoo is an all-in-one management software that offers a range of business applications that form a complete suite of enterprise management applications. The Odoo solution is ideal for SMEs, but fits both small and large companies alike",
            "CRM systems are designed to compile information on customers across different channels or points of contact between the customer and the company which could include the company's website, telephone, live chat, direct mail, marketing materials and social media.",
            "WorkForce Automation is a category of software and related services used to manage employees working outside the company premises;Such as Sales Force Automation SFA, Field Services Automation FSA , Warehouse Management System WMS and Assets Tracking System",
            "We Design and Develop applications with latest Technologies of android and ios plaforms for Enterprise Customers To support and integrate and to automate the full cycle of any Entrprise Solutions , serving the Operations ,HR ,Supply Chain , Sales and Marketing automations , POS and Restaurants Solutions",
            "we are focusing on FMCG and distributions Industry ,services we are experts in are 1- Marketing Research which is to provide our customers with retail Census and Marketing Research . 2- Digital Routing digital and professional service creates better solutions, building geographically compact, logical, and balanced workloads"
           ,"creating innovative custom web applications that meet and exceed expectations. Our specialized custom web application development team offers the highest level of usability, scalability and complete compatibility in browsers and platforms. designed to fit into a framework of usability, performance ",
            "WorkForce Automation is a category of software and related services used to manage employees working outside the company premises;Such as Sales Force Automation SFA, Field Services Automation FSA , Warehouse Management System WMS and Assets Tracking System"
            , "We Design and Develop applications with latest Technologies of android and ios plaforms for Enterprise Customers To support and integrate and to automate the full cycle of any Entrprise Solutions , serving the Operations ,HR ,Supply Chain , Sales and Marketing "};
    private int[] images = {R.drawable.mob,
            R.drawable.lap,
            R.drawable.db,
            R.drawable.mob,
            R.drawable.map1,
            R.drawable.not,
            R.drawable.lap,
            R.drawable.db,
            R.drawable.mob,};



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout1, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter1.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {
        return titles.length;

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        public ViewHolder(View itemView) {
            super(itemView);
            itemImage =
                    (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle =
                    (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
        }
    }
}