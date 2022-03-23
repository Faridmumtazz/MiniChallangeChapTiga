package mumtaz.binar.chaptertigaii

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datanama = arguments?.getString("LOGIN")
        tv_userr.text = datanama

        val dataumur = arguments?.getString("HASIL")
        tv_umurr.text = dataumur


        if (dataumur!!.toInt() % 2 == 0) {
            tv_ket.text = "Ganjil"
        } else {
            tv_ket.text = "Genap"
        }


        gobackdua.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }


}