package com.example.lab5


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lab5.databinding.NuevoFragmentBinding

class new : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val binding: NuevoFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.nuevo_fragment, container, false
        )

        binding.add.setOnClickListener(){ view:View->
            val newname = binding.editText.text.toString()
            val newcode = binding.editText2.text.toString()
            var lista = inventory.dinventory
            val pro = product(newname, newcode)
            var fi = row(pro, 0)
            lista.add(fi)
            Navigation.findNavController(view).navigate(R.id.action_newone_to_fList)
        }
        return binding.root
    }

}
