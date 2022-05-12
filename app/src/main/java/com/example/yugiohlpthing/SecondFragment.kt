package com.example.yugiohlpthing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.example.yugiohlpthing.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSecond.setOnClickListener{
            val clk_rotate = AnimationUtils.loadAnimation(this.context, R.anim.rotate_clockwise)
            binding.textviewSecond.setText("4000")
            binding.textviewSecond.startAnimation(clk_rotate)
        }
    }

    override fun onStart() {
        super.onStart()
        val clk_rotate = AnimationUtils.loadAnimation(this.context, R.anim.rotate_clockwise)
        val textView : TextView? = activity?.findViewById(R.id.textview_second)
        textView?.startAnimation(clk_rotate)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}