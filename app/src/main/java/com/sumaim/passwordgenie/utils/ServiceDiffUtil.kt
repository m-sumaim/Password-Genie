package com.sumaim.passwordgenie.utils

import androidx.recyclerview.widget.DiffUtil
import com.sumaim.passwordgenie.model.Service

class ServiceDiffUtil(private val oldList: List<Service>, private val newList: List<Service>): DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }
}