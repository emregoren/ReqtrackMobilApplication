package com.ketechsoft.belediyemyanimda.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ketechsoft.belediyemyanimda.R
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
class ComplaintListViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.adapter_item_complaint_list,
        container,
        false
    )
) {
    val txtComplaintMesssage: TextView = itemView.findViewById(R.id.txtComplaintMesssage)
    val txtComplaintStatu: TextView = itemView.findViewById(R.id.txtComplaintStatu)
    val txtComplaintDate: TextView = itemView.findViewById(R.id.txtComplaintDate)
    fun bind(comlaintModel: ComplaintModel) {
        txtComplaintMesssage.text = comlaintModel.message
        txtComplaintStatu.text = comlaintModel.status
        txtComplaintDate.text = comlaintModel.date
    }
}

