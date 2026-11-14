package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class jlh extends SQLiteOpenHelper {
    public static final String[] b = {"id", ImagesContract.URL, "title", "content_path", "timestamp", "image_path", "transcoded", "filesize", "content_mime_type", "visit_count"};
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jlh(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, byte b2) {
        super(context, str, cursorFactory, i);
        this.a = b2;
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final ArrayList h(Collection collection, boolean z) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursorQuery = null;
        try {
            cursorQuery = writableDatabase.query("reading", new String[]{"image_path", "content_path"}, "id in (" + new r40(",", (byte) 3).b(collection) + ")", null, null, null, null);
            if (cursorQuery.moveToFirst()) {
                do {
                    String string = cursorQuery.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                    if (z) {
                        String string2 = cursorQuery.getString(1);
                        if (!TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                } while (cursorQuery.moveToNext());
            }
            return arrayList;
        } finally {
            xvg.l(cursorQuery);
        }
    }

    public final Long k(String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        try {
            cursorQuery = getWritableDatabase().query("reading", new String[]{"id"}, "url=?", new String[]{str}, null, null, null);
        } catch (Throwable th2) {
            cursorQuery = null;
            th = th2;
        }
        try {
            Long lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(0)) : null;
            xvg.l(cursorQuery);
            return lValueOf;
        } catch (Throwable th3) {
            th = th3;
            xvg.l(cursorQuery);
            throw th;
        }
    }

    public final ArrayList m() throws Throwable {
        hlh hlhVar;
        try {
            Cursor cursorQuery = getWritableDatabase().query("reading", b, null, null, null, null, "id DESC", null);
            hlhVar = new hlh(cursorQuery);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                for (int i = 0; i < cursorQuery.getCount(); i++) {
                    cursorQuery.moveToPosition(i);
                    arrayList.add(new ilh(hlhVar));
                }
                xvg.l(hlhVar);
                return arrayList;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                xvg.l(hlhVar);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            hlhVar = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        switch (this.a) {
            case 2:
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
                break;
            default:
                super.onConfigure(sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.a) {
            case 0:
                sQLiteDatabase.execSQL("CREATE TABLE reading (id INTEGER PRIMARY KEY AUTOINCREMENT, url TEXT UNIQUE NOT NULL, title TEXT NOT NULL, timestamp INTEGER NULL, image_path TEXT NULL, content_path TEXT NULL, content_mime_type TEXT NULL, transcoded INTEGER NOT NULL DEFAULT 0, filesize INTEGER NULL, visit_count INTEGER NOT NULL DEFAULT 0)");
                break;
            case 1:
                sQLiteDatabase.execSQL("CREATE TABLE articles (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, secondary_id TEXT, title TEXT NOT NULL, type TEXT NOT NULL, summary TEXT, original_img_url TEXT, insta_url TEXT, page_url TEXT, source_url TEXT, source_name TEXT, date_time INTEGER, request_id TEXT, more_id TEXT, hot_topic_id TEXT, category TEXT, recommend_type TEXT, infra_feedback TEXT, related_original_news_entry_id TEXT, category_name TEXT, category_id TEXT, share_count INTEGER, secondary_img_url TEXT, tertiary_img_url TEXT, opentype INTEGER DEFAULT -1, news_id TEXT, video_view_count INTEGER, video_upload_timestamp INTEGER, video_duration INTEGER, video_width INTEGER, video_height INTEGER, video_auto_play_flag INTEGER, like_count INTEGER, dislike_count INTEGER, emotions TEXT, logo_url TEXT, bg_image TEXT, video_card_style INTEGER, feedback_reason_map TEXT, publisher_id TEXT, publisher_name TEXT, publisher_logo TEXT, publisher_description TEXT, publisher_reason TEXT, publisher_last_update_time INTEGER, publisher_subscribers INTEGER, publisher_posts INTEGER, publisher_infra_feedback TEXT, share_url TEXT, downloaded_date_time INTEGER, stream_id TEXT NOT NULL, local_news_city_name TEXT, is_headlines_carousel_article flag INTEGER, podcast TEXT, banner TEXT,  event_carousel TEXT, trending_search_card TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE categories (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, code TEXT NOT NULL, name TEXT NOT NULL, subscribed INTEGER NOT NULL, supported flag INTEGER DEFAULT 1, selected flag INTEGER, user_position INTEGER DEFAULT -1 );");
                sQLiteDatabase.execSQL("CREATE TABLE images (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, image_url TEXT, video_url TEXT, thumbnail_url TEXT NOT NULL, description TEXT, width INTEGER, height INTEGER, stream_id TEXT NOT NULL );");
                sQLiteDatabase.execSQL("CREATE TABLE feedback_reasons (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, reason_group TEXT NOT NULL, reason_map TEXT NOT NULL);");
                sQLiteDatabase.execSQL("CREATE TABLE cities (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, city_index INTEGER NOT NULL, city_id TEXT NOT NULL, name TEXT NOT NULL, state TEXT NOT NULL, zip_code TEXT NOT NULL, origin INTEGER NOT NULL, selected_state INTEGER NOT NULL );");
                sQLiteDatabase.execSQL("CREATE TABLE city_registrations (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, city_id TEXT NOT NULL, name TEXT NOT NULL, state TEXT NOT NULL, zip_code TEXT NOT NULL, origin INTEGER NOT NULL, country_code TEXT NOT NULL, language_code TEXT NOT NULL, selected_state INTEGER NOT NULL );");
                break;
            default:
                sQLiteDatabase.execSQL("CREATE TABLE icons (id INTEGER PRIMARY KEY AUTOINCREMENT,origin TEXT UNIQUE)");
                h58 h58Var = mnj.e;
                w4 w4VarE = sko.e(h58Var, h58Var);
                while (w4VarE.hasNext()) {
                    mnj mnjVar = (mnj) w4VarE.next();
                    int i = vnj.j;
                    String strX = ybh.x(mnjVar);
                    String strD = ybh.d(mnjVar);
                    String strD2 = ybh.d(mnjVar);
                    StringBuilder sbN = z1m.n("CREATE TABLE ", strX, " (icon INTEGER,", strD, " INTEGER NOT NULL,PRIMARY KEY (icon, ");
                    sbN.append(strD2);
                    sbN.append("),FOREIGN KEY(icon) REFERENCES icons(id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL(sbN.toString());
                }
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.a) {
            case 2:
                break;
            default:
                super.onDowngrade(sQLiteDatabase, i, i2);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        switch (this.a) {
            case 0:
                if (i < 2) {
                    sQLiteDatabase.execSQL("ALTER TABLE reading RENAME TO reading_old");
                    sQLiteDatabase.execSQL("CREATE TABLE reading (id INTEGER PRIMARY KEY AUTOINCREMENT, url TEXT UNIQUE NOT NULL, title TEXT NOT NULL, timestamp INTEGER NULL, image_path TEXT NULL, content_path TEXT NULL, content_mime_type TEXT NULL, transcoded INTEGER NOT NULL DEFAULT 0, filesize INTEGER NULL, visit_count INTEGER NOT NULL DEFAULT 0)");
                    sQLiteDatabase.execSQL("INSERT INTO reading SELECT * FROM reading_old WHERE url IS NOT NULL");
                    sQLiteDatabase.execSQL("DROP TABLE reading_old");
                }
                if (i == 2) {
                    sQLiteDatabase.execSQL("ALTER TABLE reading ADD filesize INTEGER NULL");
                }
                if (i >= 2) {
                    if (i < 4) {
                        sQLiteDatabase.execSQL("ALTER TABLE reading ADD content_mime_type TEXT NULL");
                    }
                    if (i < 5) {
                        sQLiteDatabase.execSQL("ALTER TABLE reading ADD visit_count INTEGER NOT NULL DEFAULT 0");
                        break;
                    }
                }
                break;
            case 1:
                if (i < 5) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS categories");
                    sQLiteDatabase.execSQL("CREATE TABLE categories (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, code TEXT NOT NULL, name TEXT NOT NULL, subscribed INTEGER NOT NULL, supported flag INTEGER DEFAULT 1, selected flag INTEGER, user_position INTEGER DEFAULT -1 );");
                } else if (i < 8) {
                    sQLiteDatabase.execSQL("ALTER TABLE categories ADD COLUMN supported flag INTEGER DEFAULT 1");
                    sQLiteDatabase.execSQL("ALTER TABLE categories ADD COLUMN selected flag INTEGER");
                    sQLiteDatabase.execSQL("ALTER TABLE categories ADD COLUMN user_position INTEGER DEFAULT -1");
                }
                if (i < 6) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS articles");
                    sQLiteDatabase.execSQL("CREATE TABLE articles (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, secondary_id TEXT, title TEXT NOT NULL, type TEXT NOT NULL, summary TEXT, original_img_url TEXT, insta_url TEXT, page_url TEXT, source_url TEXT, source_name TEXT, date_time INTEGER, request_id TEXT, more_id TEXT, hot_topic_id TEXT, category TEXT, recommend_type TEXT, infra_feedback TEXT, related_original_news_entry_id TEXT, category_name TEXT, category_id TEXT, share_count INTEGER, secondary_img_url TEXT, tertiary_img_url TEXT, opentype INTEGER DEFAULT -1, news_id TEXT, video_view_count INTEGER, video_upload_timestamp INTEGER, video_duration INTEGER, video_width INTEGER, video_height INTEGER, video_auto_play_flag INTEGER, like_count INTEGER, dislike_count INTEGER, emotions TEXT, logo_url TEXT, bg_image TEXT, video_card_style INTEGER, feedback_reason_map TEXT, publisher_id TEXT, publisher_name TEXT, publisher_logo TEXT, publisher_description TEXT, publisher_reason TEXT, publisher_last_update_time INTEGER, publisher_subscribers INTEGER, publisher_posts INTEGER, publisher_infra_feedback TEXT, share_url TEXT, downloaded_date_time INTEGER, stream_id TEXT NOT NULL, local_news_city_name TEXT, is_headlines_carousel_article flag INTEGER, podcast TEXT, banner TEXT,  event_carousel TEXT, trending_search_card TEXT);");
                } else {
                    if (i < 7) {
                        sQLiteDatabase.execSQL("DELETE FROM articles WHERE ROWID NOT IN (SELECT MIN(ROWID) FROM articles GROUP BY article_id);");
                    }
                    if (i < 11) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN opentype INTEGER DEFAULT -1");
                    }
                    if (i < 12) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN news_id TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_view_count INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_upload_timestamp INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_duration INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_width INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_height INTEGER");
                    }
                    if (i < 17) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_auto_play_flag INTEGER");
                    }
                    if (i < 18) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN like_count INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN dislike_count INTEGER");
                    }
                    if (i < 21) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN logo_url TEXT");
                    }
                    if (i < 23) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN video_card_style INTEGER");
                    }
                    if (i < 24) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN feedback_reason_map TEXT");
                    }
                    if (i < 26) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN emotions TEXT");
                    }
                    if (i < 27) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_id TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_name TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_logo TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_description TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_reason TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_last_update_time INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_subscribers INTEGER");
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_posts INTEGER");
                    }
                    if (i < 28) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN publisher_infra_feedback TEXT");
                    }
                    if (i < 29) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN bg_image TEXT");
                    }
                    if (i < 30) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN share_url TEXT");
                    }
                    if (i < 31) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN downloaded_date_time INTEGER");
                    }
                    if (i < 34) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN local_news_city_name TEXT");
                    }
                    if (i < 36) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN is_headlines_carousel_article flag INTEGER");
                    }
                    if (i < 38) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN podcast TEXT");
                    }
                    if (i < 39) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN banner TEXT");
                    }
                    if (i < 40) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN event_carousel TEXT");
                    }
                    if (i < 41) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles RENAME TO articles2");
                        sQLiteDatabase.execSQL("CREATE TABLE articles (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, secondary_id TEXT, title TEXT NOT NULL, type TEXT NOT NULL, summary TEXT, original_img_url TEXT, insta_url TEXT, page_url TEXT, source_url TEXT, source_name TEXT, date_time INTEGER, request_id TEXT, more_id TEXT, hot_topic_id TEXT, category TEXT, recommend_type TEXT, infra_feedback TEXT, related_original_news_entry_id TEXT, category_name TEXT, category_id TEXT, share_count INTEGER, secondary_img_url TEXT, tertiary_img_url TEXT, opentype INTEGER DEFAULT -1, news_id TEXT, video_view_count INTEGER, video_upload_timestamp INTEGER, video_duration INTEGER, video_width INTEGER, video_height INTEGER, video_auto_play_flag INTEGER, like_count INTEGER, dislike_count INTEGER, emotions TEXT, logo_url TEXT, bg_image TEXT, video_card_style INTEGER, feedback_reason_map TEXT, publisher_id TEXT, publisher_name TEXT, publisher_logo TEXT, publisher_description TEXT, publisher_reason TEXT, publisher_last_update_time INTEGER, publisher_subscribers INTEGER, publisher_posts INTEGER, publisher_infra_feedback TEXT, share_url TEXT, downloaded_date_time INTEGER, stream_id TEXT NOT NULL, local_news_city_name TEXT, is_headlines_carousel_article flag INTEGER, podcast TEXT, banner TEXT,  event_carousel TEXT);");
                        sQLiteDatabase.execSQL("INSERT INTO articles SELECT _id, article_id, secondary_id, title, type, summary, original_img_url, insta_url, page_url, source_url, source_name, date_time, request_id, more_id, hot_topic_id, category, recommend_type, infra_feedback, related_original_news_entry_id, category_name, category_id, share_count, secondary_img_url, tertiary_img_url, opentype, news_id, video_view_count, video_upload_timestamp, video_duration, video_width, video_height, video_auto_play_flag, like_count, dislike_count, emotions, logo_url, bg_image, video_card_style, feedback_reason_map, publisher_id, publisher_name, publisher_logo, publisher_description, publisher_reason, publisher_last_update_time, publisher_subscribers, publisher_posts, publisher_infra_feedback, share_url, downloaded_date_time, stream_id, local_news_city_name, is_headlines_carousel_article, podcast, NULL, NULL FROM articles2");
                        sQLiteDatabase.execSQL("DROP TABLE articles2");
                    }
                    if (i < 42) {
                        sQLiteDatabase.execSQL("ALTER TABLE articles ADD COLUMN trending_search_card TEXT");
                    }
                }
                if (i < 9) {
                    sQLiteDatabase.execSQL("CREATE TABLE images (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, image_url TEXT, video_url TEXT, thumbnail_url TEXT NOT NULL, description TEXT, width INTEGER, height INTEGER, stream_id TEXT NOT NULL );");
                } else if (i == 9) {
                    sQLiteDatabase.execSQL("ALTER TABLE images RENAME TO imagesFNORD");
                    sQLiteDatabase.execSQL("CREATE TABLE images (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, article_id TEXT NOT NULL, image_url TEXT, video_url TEXT, thumbnail_url TEXT NOT NULL, description TEXT, width INTEGER, height INTEGER, stream_id TEXT NOT NULL );");
                    sQLiteDatabase.execSQL("INSERT INTO images SELECT * FROM imagesFNORD");
                    sQLiteDatabase.execSQL("DROP TABLE  imagesFNORD");
                }
                if (i < 18) {
                    sQLiteDatabase.execSQL("CREATE TABLE feedback_reasons (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, reason_group TEXT NOT NULL, reason_map TEXT NOT NULL);");
                }
                if (i < 32) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS citylist");
                    sQLiteDatabase.execSQL("DELETE FROM articles WHERE type = 'local_news'");
                }
                if (i < 33) {
                    sQLiteDatabase.execSQL("CREATE TABLE cities (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, city_index INTEGER NOT NULL, city_id TEXT NOT NULL, name TEXT NOT NULL, state TEXT NOT NULL, zip_code TEXT NOT NULL, origin INTEGER NOT NULL, selected_state INTEGER NOT NULL );");
                }
                if (i < 35) {
                    sQLiteDatabase.execSQL("CREATE TABLE city_registrations (_id TEXT PRIMARY KEY ON CONFLICT IGNORE, city_id TEXT NOT NULL, name TEXT NOT NULL, state TEXT NOT NULL, zip_code TEXT NOT NULL, origin INTEGER NOT NULL, country_code TEXT NOT NULL, language_code TEXT NOT NULL, selected_state INTEGER NOT NULL );");
                }
                if (i < 37) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notifications");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS active_notifications");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_push_notifications");
                    break;
                }
                break;
            default:
                if (i == 1 && i2 >= 2) {
                    int i3 = vnj.j;
                    mnj mnjVar = mnj.b;
                    String strX = ybh.x(mnjVar);
                    String strD = ybh.d(mnjVar);
                    String strD2 = ybh.d(mnjVar);
                    StringBuilder sbN = z1m.n("CREATE TABLE ", strX, " (icon INTEGER,", strD, " INTEGER NOT NULL,PRIMARY KEY (icon, ");
                    sbN.append(strD2);
                    sbN.append("),FOREIGN KEY(icon) REFERENCES icons(id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL(sbN.toString());
                }
                if (i <= 2 && i2 >= 3) {
                    int i4 = vnj.j;
                    mnj mnjVar2 = mnj.c;
                    String strX2 = ybh.x(mnjVar2);
                    String strD3 = ybh.d(mnjVar2);
                    String strD4 = ybh.d(mnjVar2);
                    StringBuilder sbN2 = z1m.n("CREATE TABLE ", strX2, " (icon INTEGER,", strD3, " INTEGER NOT NULL,PRIMARY KEY (icon, ");
                    sbN2.append(strD4);
                    sbN2.append("),FOREIGN KEY(icon) REFERENCES icons(id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL(sbN2.toString());
                    break;
                }
                break;
        }
    }
}
