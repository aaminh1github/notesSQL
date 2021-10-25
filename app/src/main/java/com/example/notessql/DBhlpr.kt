package com.example.notessql

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBhlpr(context:Context):
    SQLiteOpenHelper(context, "database.db", null, 1) {
    private val SQLiteDatabase:SQLiteDatabase=writableDatabase
    override fun onCreate(db: SQLiteDatabase?) {
    if(db!=null)
    db.execSQL("create table notes(note text)")}

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    fun saveNote(note:String){
        val contentValeus= ContentValues()
        contentValeus.put("note",note)
        SQLiteDatabase.insert("notes",null,contentValeus)
    }
}