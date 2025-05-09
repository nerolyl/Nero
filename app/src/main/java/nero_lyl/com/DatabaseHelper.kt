package nero_lyl.com

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        //Database information and version
        private const val DATABASE_NAME = "NeroDatabase.db"
        private const val DATABASE_VERSION = 1

        //Database Tables
        private const val TABLE_USER = "USER"
        private const val TABLE_DEVICE = "DEVICE"
        private const val TABLE_CAMERA = "CAMERA"
        private const val TABLE_ALERT = "ALERT"
        private const val TABLE_RECORD = "RECORD"
        private const val TABLE_EVENT = "EVENT"
        private const val TABLE_PERSON = "PERSON"
        private const val TABLE_CAR = "CAR"
        private const val TABLE_AI_MODEL = "AI_MODEL"

        //Database Tables (Many-to-many)
        private const val TABLE_USER_DEVICE = "USER_DEVICE"
        private const val TABLE_USER_ALERT = "USER_ALERT"
        private const val TABLE_USER_CAMERA = "USER_CAMERA"
        private const val TABLE_DEVICE_CAMERA = "DEVICE_CAMERA"
        private const val TABLE_CAMERA_EVENT = "CAMERA_EVENT"
        private const val TABLE_PERSON_CAR_EVENT = "PERSON_CAR_EVENT"

        //Database Columns for USER table
        private const val COLUMN_USER_ID = "USER_ID" //Primary Key
        private const val COLUMN_PHONE_NUMBER = "PHONE_NUMBER"
        private const val COLUMN_USER_TYPE = "USER_TYPE"
        private const val COLUMN_EMAIL = "EMAIL"
        private const val COLUMN_PASSWORD = "PASSWORD"
        private const val COLUMN_FIRST_NAME = "FIRST_NAME"
        private const val COLUMN_LAST_NAME = "LAST_NAME"

        //Database Columns for DEVICE table
        private const val COLUMN_DEVICE_ID = "DEVICE_ID" //Primary Key
        private const val COLUMN_DEVICE_NAME = "DEVICE_NAME"
        private const val COLUMN_DEVICE_TYPE = "DEVICE_TYPE"
        private const val COLUMN_LAST_ACTIVE = "LAST_ACTIVE"

        //Database Columns for CAMERA table
        private const val COLUMN_CAMERA_ID = "CAMERA_ID" //Primary Key
        private const val COLUMN_CAMERA_IP = "CAMERA_IP"
        private const val COLUMN_CAMERA_TIME = "CAMERA_TIME"
        private const val COLUMN_CAMERA_LOCATION = "CAMERA_LOCATION"
        private const val COLUMN_CAMERA_STATUS = "CAMERA_STATUS"

        //Database Columns for ALERT table
        private const val COLUMN_ALERT_ID = "ALERT_ID" //Primary Key
        private const val COLUMN_ALERT_EVENT_ID = "ALERT_EVENT_ID" //Foreign Key
        private const val COLUMN_ALERT_TYPE = "ALERT_TYPE"
        private const val COLUMN_ALERT_TIME = "ALERT_TIME"
        private const val COLUMN_ALERT_STATUS = "ALERT_STATUS"

        //Database Columns for RECORD table
        private const val COLUMN_RECORD_ID = "RECORD_ID" //Primary Key
        private const val COLUMN_RECORD_CAMERA_ID = "RECORD_CAMERA_ID" //Foreign Key
        private const val COLUMN_RECORD_TIME = "RECORD_TIME"
        private const val COLUMN_RECORD_DURATION = "RECORD_DURATION"
        private const val COLUMN_RECORD_FILE_PATH = "RECORD_FILE_PATH"
        private const val COLUMN_RECORD_QUALITY = "RECORD_QUALITY"
        private const val COLUMN_RECORD_EVENT_TRIGGERED = "RECORD_EVENT_TRIGGERED"

        //Database Columns for EVENT table
        private const val COLUMN_EVENT_ID = "EVENT_ID" //Primary Key
        private const val COLUMN_EVENT_RECORD_ID = "EVENT_RECORD_ID" //Foreign Key
        private const val COLUMN_EVENT_MODEL_ID = "EVENT_MODEL_ID" //Foreign Key
        private const val COLUMN_EVENT_CONFIDENCE_SCORE = "EVENT_CONFIDENCE_SCORE"
        private const val COLUMN_EVENT_AI_MODEL_NAME = "EVENT_AI_MODEL_NAME" //Model name from AI_MODEL table
        private const val COLUMN_EVENT_TIMESTAMP = "EVENT_TIMESTAMP" //Nullable
        private const val COLUMN_EVENT_TIME = "EVENT_TIME"//Nullable
        private const val COLUMN_EVENT_TYPE = "EVENT_TYPE"

        //Database Columns for PERSON table
        private const val COLUMN_PERSON_ID = "PERSON_ID" //Primary Key
        private const val COLUMN_PERSON_FACE = "PERSON_FACE"
        private const val COLUMN_PERSON_BODY = "PERSON_BODY"

        //Database Columns for CAR table
        private const val COLUMN_CAR_PLATE = "CAR_PLATE" //Primary Key
        private const val COLUMN_CAR_PERSON_ID = "CAR_PERSON_ID" //Foreign Key, Nullable
        private const val COLUMN_CAR_BODY = "CAR_BODY"
        private const val COLUMN_CAR_COLOR = "CAR_COLOR"

        //Database Columns for AI_MODEL table
        private const val COLUMN_AI_MODEL_ID = "AI_MODEL_ID" //Primary Key
        private const val COLUMN_AI_MODEL_NAME = "AI_MODEL_NAME"
        private const val COLUMN_AI_MODEL_DESCRIPTION = "AI_MODEL_DESCRIPTION"
        private const val COLUMN_AI_MODEL_VERSION = "AI_MODEL_VERSION"

    }
    override fun onCreate(db: SQLiteDatabase) {

    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
}