package me.soushin.tinmvvm.common.res.layout

fun mvvmXml(
    packageName: String,
    fragmentClass: String,
    lowerPkgName:String,
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>
        <variable
            name="${fragmentClass}VM"
            type="${packageName}.${lowerPkgName}.${fragmentClass}ViewModel" />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
"""
