package com.ketechsoft.belediyemyanimda.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ketechsoft.belediyemyanimda.R

/**
 * A simple [Fragment] subclass.
 */
class NewComplaintFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_complaint, container, false)
    }

}
