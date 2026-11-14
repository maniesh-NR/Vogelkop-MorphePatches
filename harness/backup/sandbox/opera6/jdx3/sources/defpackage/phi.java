package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.opera.api.Callback;
import java.util.HashSet;

/* loaded from: classes.dex */
public class phi implements acl, hh4 {
    public static final HashSet c = new HashSet();
    public final Callback a;
    public boolean b;

    public phi(Callback callback) {
        this.a = callback;
    }

    public void a(Exception exc, Drawable drawable) {
        if (this.b) {
            return;
        }
        c.remove(this);
        this.a.run(null);
    }

    public final void b(Drawable drawable) {
        c.add(this);
    }

    public final void c(Bitmap bitmap, int i) {
        if (this.b) {
            return;
        }
        c.remove(this);
        this.a.run(bitmap);
    }

    @Override // defpackage.hh4
    public final void cancel() {
        if (this.b) {
            return;
        }
        this.b = true;
        c.remove(this);
    }
}
