package com.example.aplikasibuku

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.lang.IllegalStateException

class ViewPagerAdapter(var fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int):Fragment{
        if (position == 0){
            return PinjamFragment()
        } else if (position == 1){
            return Kembali()
        } else throw IllegalStateException("Position not valid")
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position ==0 ||position %2 == 0){
            return "tersedia"
        } else if (position %2== 1){
            return "dipinjam"
        } else throw IllegalStateException("Position not valid")
    }
}