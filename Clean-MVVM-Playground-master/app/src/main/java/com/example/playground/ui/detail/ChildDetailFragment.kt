package com.example.playground.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.playground.Constants
import com.example.playground.R
import com.example.playground.databinding.FragmentChildDetailBinding
import com.example.playground.utils.autoCleared

class ChildDetailFragment : Fragment() {
    private var binding by autoCleared<FragmentChildDetailBinding>()
//    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentChildDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvName.setOnClickListener {
            findNavController().navigate(R.id.navigation_movies)
        }
//        binding.tvDesc.text = args.description
//        Glide.with(requireContext()).load(Constants.TMDB_POSTER_PATH + args.pictureUrl).into(binding.ivMedia)
    }
}
