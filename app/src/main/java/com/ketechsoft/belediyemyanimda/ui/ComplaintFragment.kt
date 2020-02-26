package com.ketechsoft.belediyemyanimda.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ketechsoft.belediyemyanimda.R
import com.ketechsoft.belediyemyanimda.mock.MockList
import com.ketechsoft.belediyemyanimda.ui.adapter.ComplaintListAdapter
import kotlinx.android.synthetic.main.fragment_complaint.*

/**
 * A simple [Fragment] subclass.
 */
class ComplaintFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_complaint, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycWriterList.adapter = ComplaintListAdapter(MockList.getMockedComplainList())
        recycWriterList.layoutManager = LinearLayoutManager(context)
    }


}
