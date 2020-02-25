package com.ketechsoft.belediyemyanimda.ui.adapter


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ketechsoft.belediyemyanimda.model.ComplaintModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Emre GÖREN     ║
╠════════════════════════════╣
║ emregrnn58@gmail.com       ║
╠════════════════════════════╣
║     24/02/2020 - 14:05     ║
╚════════════════════════════╝
 */
class ComplaintListAdapter(val complaintList: List<ComplaintModel>) :
    RecyclerView.Adapter<ComplaintListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComplaintListViewHolder {
        return ComplaintListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return complaintList.size
    }

    override fun onBindViewHolder(holder: ComplaintListViewHolder, position: Int) {
        holder.bind(complaintList[position])
    }
}
