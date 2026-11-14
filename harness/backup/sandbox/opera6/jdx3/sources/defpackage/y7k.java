package defpackage;

import android.content.Context;
import android.net.Uri;
import com.opera.android.OperaApplication;
import java.util.Map;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y7k extends q37 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7k(int i, int[] iArr, byte b) {
        super(i, iArr);
        this.c = b;
    }

    @Override // defpackage.q37, defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) {
        switch (this.c) {
            case 2:
                if (((Boolean) scd.g0(h.a, new cek(this, context, (l1b) map, (mt5) null, (byte) 3))).booleanValue()) {
                    super.a(lqmVar, context, i, map, uri, g8fVar);
                    break;
                }
                break;
            default:
                super.a(lqmVar, context, i, map, uri, g8fVar);
                break;
        }
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        switch (this.c) {
            case 2:
                if ((!Intrinsics.a(l1bVar.get("rt"), "true") || !ru9.c(context).a.getBoolean("tab_gallery.tabui2_bubble_tour_shown", false)) && !Intrinsics.a(l1bVar.get("ra"), "true")) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 7:
                String[] strArr = OperaApplication.K;
                return cs5.E(((lz6) ((OperaApplication) context.getApplicationContext()).J.get()).a().k(), mt5Var);
            default:
                return super.b(context, l1bVar, mt5Var);
        }
    }
}
