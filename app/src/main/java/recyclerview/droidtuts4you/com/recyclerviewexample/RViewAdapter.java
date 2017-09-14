package recyclerview.droidtuts4you.com.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ashish on 15-09-2017.
 */

public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.MyViewHolder>{
    private List<RView> mList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView androidName, androidVersion;
        public ImageView androidLogo;

        public MyViewHolder(View view) {
            super(view);
            androidName = (TextView) view.findViewById(R.id.android_name);
            androidVersion = (TextView) view.findViewById(R.id.android_version);
            androidLogo = (ImageView) view.findViewById(R.id.android_logo);
        }
    }

    public RViewAdapter(List<RView> mList) {
        this.mList = mList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RView c = mList.get(position);
        holder.androidName.setText(c.getAndroidName());
        holder.androidVersion.setText(c.getAndroidVersion());
        holder.androidLogo.setImageResource(mList.get(position).getAndroidLogo());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
