package clpal.mystaticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import clpal.changeablefragment.R


class FragmentOne : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View?
        view = inflater.inflate(R.layout.fragment_one, container, false)
        return view
    }

}