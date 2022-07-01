package team.umc.informe.src

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import team.umc.informe.R
import team.umc.informe.config.BaseActivity
import team.umc.informe.databinding.ActivityMainBinding
import team.umc.informe.src.main.List.ListFragment
import team.umc.informe.src.main.home.HomeFragment
import team.umc.informe.src.main.sample.SampleFragment

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
                }
                R.id.sample_tab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ListFragment())
                        .commitAllowingStateLoss()
                }
            }
        }
    }

}