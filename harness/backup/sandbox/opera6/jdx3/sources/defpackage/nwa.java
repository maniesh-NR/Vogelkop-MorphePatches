package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.opera.android.live_score.LiveCommentaryService;

/* loaded from: classes.dex */
public final class nwa implements acl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nwa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void d(Exception exc, Drawable drawable) {
    }

    private final void e(Drawable drawable) {
    }

    private final void f(Drawable drawable) {
    }

    private final void g(Drawable drawable) {
    }

    private final void h(Drawable drawable) {
    }

    public final void a(Exception exc, Drawable drawable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                i();
                break;
            case 1:
                break;
            case 2:
                ((ynj) obj).a(znj.a);
                break;
            case 3:
                nh4 nh4Var = (nh4) obj;
                if (quk.a.remove(this) && (nh4Var.r() instanceof c0f)) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith((Object) null);
                    break;
                }
                break;
            default:
                ((ne5) obj).P(t7l.a);
                break;
        }
    }

    public final void b(Drawable drawable) {
        switch (this.a) {
            case 0:
                i();
                break;
        }
    }

    public final void c(Bitmap bitmap, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (bitmap == null) {
                    i();
                    break;
                } else {
                    owa owaVar = (owa) obj;
                    int i2 = owa.l;
                    Context context = owaVar.a;
                    hq4 hq4Var = new hq4(bitmap, (context.getResources().getDimensionPixelSize(2131165329) - (wz3.a.k(context) << 1)) - (z7h.h(context, 2.0f) << 1));
                    vml.a(owaVar.f);
                    owaVar.c.b(hq4Var);
                    break;
                }
            case 1:
                LiveCommentaryService liveCommentaryService = (LiveCommentaryService) obj;
                liveCommentaryService.e = bitmap;
                gkg gkgVar = liveCommentaryService.c;
                if (gkgVar != null && gkgVar.r) {
                    Handler handler = gkgVar.f;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                        break;
                    }
                }
                break;
            case 2:
                ((ynj) obj).a(new boj(bitmap));
                break;
            case 3:
                nh4 nh4Var = (nh4) obj;
                if (quk.a.remove(this) && (nh4Var.r() instanceof c0f)) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(bitmap);
                    break;
                }
                break;
            default:
                ne5 ne5Var = (ne5) obj;
                if (bitmap == null) {
                    ne5Var.P(t7l.a);
                    break;
                } else {
                    l7l l7lVar = (l7l) ne5Var.e;
                    if (l7lVar == null) {
                        l7lVar = null;
                    }
                    ne5Var.P(new u7l(new yni(l7lVar.e, bitmap)));
                    break;
                }
        }
    }

    public final void i() {
        ld9 ld9Var = ((owa) this.b).f;
        vml.a(ld9Var);
        vml.d(ld9Var, pn7.f(owa.j));
    }
}
