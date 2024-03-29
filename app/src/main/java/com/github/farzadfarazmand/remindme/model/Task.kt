package com.github.farzadfarazmand.remindme.model

import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.orhanobut.logger.Logger


@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey
    @ColumnInfo(name = "task_title")
    val title: String = "",
    @ColumnInfo(name = "task_bg_color")
    val colorCode: Int = 0,
    @ColumnInfo(name = "task_timestamp")
    val timestamp: Long = 0
)