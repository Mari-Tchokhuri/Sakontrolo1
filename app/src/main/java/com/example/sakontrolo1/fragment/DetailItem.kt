package com.example.sakontrolo1.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sakontrolo1.R
import com.google.android.material.button.MaterialButton

class DetailItem : Fragment(R.layout.fragment_detail_item) {


    private lateinit var buyNowButton: MaterialButton
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        buyNowButton = view.findViewById(R.id.buyNowButton)

        buyNowButton.setOnClickListener{
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.main, Onboarding())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

}
