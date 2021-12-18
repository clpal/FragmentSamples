package clpal.changeablefragment

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import clpal.changeablefragment.FragmentThird
import clpal.changeablefragment.R
import clpal.mystaticfragment.FragmentOne
import clpal.mystaticfragment.FragmentTwo

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    companion object {
        val fragOne: Fragment = FragmentOne()
        val fragTwo: Fragment = FragmentTwo()
        val fragthird: Fragment = FragmentThird()
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return fragOne
            1 -> return fragTwo
            2 -> return fragthird
            else -> return fragOne

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])

    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}