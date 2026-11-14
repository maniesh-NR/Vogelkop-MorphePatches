package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class gt6 implements Closeable {
    public final /* synthetic */ byte a;
    public final Object b;

    public gt6(SQLiteDatabase sQLiteDatabase, long j) {
        this.a = (byte) 1;
        this.b = sQLiteDatabase.compileStatement("INSERT INTO searchengines(" + fki.u(2) + ", " + fki.u(3) + ", " + fki.u(4) + ", " + fki.u(5) + ", " + fki.u(6) + ", " + fki.u(7) + ", " + fki.u(8) + ") VALUES(?, ?, ?, ?, ?, ?, " + String.valueOf(j) + ")");
    }

    public /* synthetic */ gt6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((HttpURLConnection) obj).disconnect();
                break;
            case 1:
                ((SQLiteStatement) obj).close();
                break;
            default:
                for (InputStream inputStream : (InputStream[]) obj) {
                    r9h.l(inputStream);
                }
                break;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        boolean z = httpURLConnection.getResponseCode() / 100 == 2;
        if (z) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            izc.c("get error failed ");
            return e.getMessage();
        }
    }

    public final l6e k(j6e j6eVar, long j) {
        SQLiteStatement sQLiteStatement = (SQLiteStatement) this.b;
        sQLiteStatement.clearBindings();
        l6e l6eVar = j6eVar.a;
        sQLiteStatement.bindString(1, l6eVar.c);
        sQLiteStatement.bindString(2, l6eVar.d);
        String str = l6eVar.e;
        if (str != null) {
            sQLiteStatement.bindString(3, str);
        }
        sQLiteStatement.bindLong(4, vep.A(l6eVar.h));
        String str2 = l6eVar.f;
        if (str2 != null) {
            sQLiteStatement.bindString(5, str2);
        }
        sQLiteStatement.bindLong(6, j);
        l6eVar.b = sQLiteStatement.executeInsert();
        return l6eVar;
    }
}
