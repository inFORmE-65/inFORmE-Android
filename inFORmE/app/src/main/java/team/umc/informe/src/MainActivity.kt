package team.umc.informe.src

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import team.umc.informe.R
import team.umc.informe.config.BaseActivity
import team.umc.informe.databinding.ActivityMainBinding
import team.umc.informe.src.main.policylist.PolicyListFragment
import team.umc.informe.src.main.home.HomeFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        supportFragmentManager.beginTransaction().replace(R.id.main_frm,
            HomeFragment()).commitAllowingStateLoss()

        binding.mainBtmNav.setOnItemReselectedListener { item ->
            when(item.itemId){
                R.id.home_tab ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemReselectedListener
                }
                R.id.sample_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, PolicyListFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemReselectedListener
                }
            }
        }


    }

}