package com.example.javalearningapp.Modules.Layouts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javalearningapp.Controller.RecyclerViewInterface;
import com.example.javalearningapp.Modules.Course;
import com.example.javalearningapp.R;

import java.util.List;

public class CourseRecyclerViewAdapter extends RecyclerView.Adapter<CourseRecyclerViewAdapter.MyViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;

    Context context;
    List<Course> courses;

    public CourseRecyclerViewAdapter(Context context, List<Course> courses, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.courses = courses;
        this.recyclerViewInterface = recyclerViewInterface;
    }




    @NonNull
    @Override
    public CourseRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        inflating the layouts

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.course_row, parent, false);

        return new CourseRecyclerViewAdapter.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseRecyclerViewAdapter.MyViewHolder holder, int position) {
//        assign values to the rows
//        passed on position

        holder.title.setText(courses.get(position).getTitle());
        holder.description.setText(courses.get(position).getDescription());
        holder.progress.setText(courses.get(position).getMyProgress()+"%");

    }

    @Override
    public int getItemCount() {
//        provide the recycler view the number of items

        return courses.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
//        grabbing the views from course_row layout file
//        its like onCreate method


        TextView title, description, progress;

        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);
            description = itemView.findViewById(R.id.textView2);
            progress = itemView.findViewById(R.id.textView3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerViewInterface != null ){
                        int position = getAdapterPosition();
                        if( position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onClickItem(position);
                        }
                    }
                }
            });
        }
    }
}
