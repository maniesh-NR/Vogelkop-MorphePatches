package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class m3k {
    public final int a;
    public final int b;
    public final float c;
    public final String d;
    public final cm e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public Bitmap j;
    public int k;
    public Bitmap l;
    public yhe m;
    public yhe n;
    public final ArrayList o;
    public t0f p;
    public int q;
    public long[] r;
    public long s;
    public boolean t;
    public Bitmap u;
    public final Context v;

    public m3k(Context context, String str, cm cmVar) {
        Resources resources = context.getResources();
        this.o = new ArrayList(2);
        this.a = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
        this.b = resources.getDimensionPixelSize(R.dimen.notification_large_icon_height);
        this.c = resources.getDisplayMetrics().density * 28.0f;
        this.d = str;
        this.e = cmVar;
        this.v = context;
    }

    public static void a(ua7 ua7Var, t0f t0fVar) {
        Bitmap bitmap = t0fVar.b;
        PendingIntent pendingIntent = t0fVar.d;
        CharSequence charSequence = t0fVar.c;
        c1f c1fVar = bitmap != null ? new c1f(IconCompat.b(bitmap), charSequence, pendingIntent) : new c1f(t0fVar.a, charSequence, pendingIntent);
        if (t0fVar.e == 2) {
            ith ithVar = new ith("key_text_reply", t0fVar.f, null, true, 0, new Bundle(), new HashSet());
            ArrayList arrayList = (ArrayList) c1fVar.a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1fVar.a = arrayList;
            }
            arrayList.add(ithVar);
        }
        ((l1f) ua7Var.b).b.add(c1fVar.a());
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(Bitmap bitmap, String str, yhe yheVar, int i, String str2) {
        ArrayList arrayList = this.o;
        if (arrayList.size() == 2) {
            qp2.n("Cannot add more than 2 actions.");
            return;
        }
        if (bitmap != null) {
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            new Canvas(bitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        arrayList.add(new t0f(bitmap, d(str), (PendingIntent) yheVar.b, i, str2));
    }

    public final Bitmap c() {
        Bitmap bitmap = this.u;
        CharSequence charSequence = this.h;
        int i = this.b;
        int i2 = this.a;
        if (bitmap != null && bitmap.getWidth() != 0) {
            return (bitmap.getWidth() > i2 || bitmap.getHeight() > i) ? Bitmap.createScaledBitmap(bitmap, i2, i, false) : bitmap;
        }
        if (charSequence == null) {
            return null;
        }
        String string = charSequence.toString();
        int iMin = Math.min(i2, i) / 2;
        o1 o1Var = new o1((byte) 3);
        o1Var.b(string);
        return new a9i(this.a, this.b, iMin, o1Var.c, o1Var.d, this.c).a(o1Var.b);
    }
}
