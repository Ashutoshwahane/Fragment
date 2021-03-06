package com.ashutosh.fragmentlifecycleapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentOne : Fragment(){

    val TAG = "fragmentone"

    //Fragment life cycle
    override fun onAttach(context: Context) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onAttach")
        return inflater.inflate(R.layout.fragment_one,container,false )

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach")

    }
}