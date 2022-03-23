package mumtaz.binar.chaptertigaii

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datanama = arguments?.getString("LOGIN")
        tv_user.text = datanama

        gototiga.setOnClickListener {
            val username = arguments?.getString("LOGIN")
            val skrg = et_skrg.text.toString().toInt()
            val lahir = et_lahir.text.toString().toInt()
            val hasil = skrg - lahir
            val data = bundleOf("HASIL" to hasil.toString(), "LOGIN" to username)

            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment, data)
        }
    }


}