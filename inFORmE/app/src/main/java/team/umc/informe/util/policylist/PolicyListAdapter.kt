package team.umc.informe.util.policylist

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import team.umc.informe.databinding.ItemPolicyRecyclerBinding

class PolicyListAdapter(val context: FragmentActivity?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var policyListDatas = mutableListOf<PolicyListData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PolicyListViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemPolicyRecyclerBinding.inflate(layoutInflater, parent, false)
        return PolicyListViewHolder(context, itemBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PolicyListViewHolder).bind(policyListDatas[position])
    }

    override fun getItemCount(): Int = policyListDatas.size

}

class PolicyListViewHolder(val context: FragmentActivity?, val binding: ItemPolicyRecyclerBinding)
    : RecyclerView.ViewHolder(binding.root){
        private val name: TextView = binding.serviceName
        private val hits: TextView = binding.serviceHits
        private val contexts: TextView = binding.serviceContext
        private val subject: TextView = binding.serviceSubject

        fun bind(item: PolicyListData){
            name.text = item.name
            hits.text = item.hits.toString()
            contexts.text = item.context
            subject.text = item.subject
        }
    }