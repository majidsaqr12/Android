package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.infoActivity;

import java.util.List;

import Model.Listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context ;
    private List <Listitem> listitems;


    public MyAdapter(Context context , List listitems) {
        this.context = context;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listitem listitem = listitems.get(position);

        holder.name.setText(listitem.getName());
        holder.description.setText(listitem.getDescription());
        holder.more.setText(listitem.getMore());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name , description , more;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.txtT);
            description = itemView.findViewById(R.id.txtD);
            more = itemView.findViewById(R.id.txtM);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Listitem listitem = listitems.get(position);
            Intent intent = new Intent(context, infoActivity.class);
            intent.putExtra("name" , listitem.getName());
            intent.putExtra("job" , listitem.getDescription());
            intent.putExtra("age" , listitem.getMore());
            context.startActivity(intent);
        }
    }
}
