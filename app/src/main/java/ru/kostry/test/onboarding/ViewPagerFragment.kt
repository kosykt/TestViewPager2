package ru.kostry.test.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*
import ru.kostry.test.R
import ru.kostry.test.onboarding.screens.FirstFragment
import ru.kostry.test.onboarding.screens.SecondFragment
import ru.kostry.test.onboarding.screens.ThirdFragment



class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(), SecondFragment(), ThirdFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        view.viewPager.adapter = adapter


        return view
    }
}