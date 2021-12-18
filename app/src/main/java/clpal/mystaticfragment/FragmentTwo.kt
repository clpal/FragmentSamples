package clpal.mystaticfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import clpal.mystaticfragment.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
private  lateinit var binding:FragmentTwoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View?

        view = inflater.inflate(R.layout.fragment_two, container, false)
        binding=FragmentTwoBinding.bind(view.rootView)
        return binding.root
    }

}