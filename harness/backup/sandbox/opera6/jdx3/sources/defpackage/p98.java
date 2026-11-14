package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p98 implements xbh {
    public final /* synthetic */ byte a;

    public /* synthetic */ p98(byte b) {
        this.a = b;
    }

    @Override // defpackage.xbh
    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                if (i == 5) {
                }
                break;
            default:
                if (i == 4) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.xbh
    public final wbh b(int i, Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar) {
        Object next;
        switch (this.a) {
            case 0:
                if (i != 5) {
                    qp2.o("Failed requirement.");
                    return null;
                }
                r98 r98Var = new r98(context, ormVar, skmVar, bundle, s0fVar, (byte) 0);
                int i2 = bundle.getInt("esim_push_notification_variant_id", -1);
                if (i2 != -1) {
                    q98.f.getClass();
                    Iterator it = q98.k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((q98) next).a == i2) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    q98 q98Var = (q98) next;
                    if (q98Var == null) {
                        throw new djb("esim_push_notification_variant_id", null);
                    }
                    r98Var.e = q98Var.b;
                    r98Var.k = q98Var.c;
                    try {
                        r98Var.f = q98Var.d.a(context.getResources()).toString();
                        r98Var.g = q98Var.e.a(context.getResources()).toString();
                    } catch (Resources.NotFoundException e) {
                        t3p.n(e);
                        return null;
                    }
                }
                return r98Var;
            default:
                if (i == 4) {
                    return new r98(context, ormVar, skmVar, bundle, s0fVar, (byte) 1);
                }
                qp2.o("Failed requirement.");
                return null;
        }
    }
}
