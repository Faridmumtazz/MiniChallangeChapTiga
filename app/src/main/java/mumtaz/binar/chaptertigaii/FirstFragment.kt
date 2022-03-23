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


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gotodua.setOnClickListener {
            val username = et_user.text.toString()
            val pass = et_pass.text.toString()
            val data = bundleOf("LOGIN" to username)
            if (username == "mmtz" && pass == "12345") {
                tv_login.text = "OK"
                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment, data)
            }else{
                tv_login.text = "Failed"
            }
        }
    }
}