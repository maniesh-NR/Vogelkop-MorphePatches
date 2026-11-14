package defpackage;

import android.content.Context;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cy0 extends SuggestionProviderBridge {
    public final Context d;
    public final brk e;

    public cy0(Context context, brk brkVar, brk brkVar2, zv3 zv3Var) {
        super(0);
        this.d = context;
        this.e = brkVar;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        yx0 yx0Var;
        List list = (List) this.e.invoke();
        if (list.isEmpty()) {
            yx0Var = yx0.a;
        } else {
            Iterator it = list.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                if (it.hasNext()) {
                    xx0 xx0Var = (xx0) it.next();
                    if (xx0Var instanceof ux0) {
                        switch (((ux0) xx0Var).a.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                            case 11:
                            case 13:
                            case 14:
                                break;
                            case 6:
                            case 7:
                            case 8:
                            case 12:
                                z5 = true;
                                continue;
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                z4 = true;
                                continue;
                            default:
                                h9o.p();
                                return;
                        }
                    } else if (Intrinsics.a(xx0Var, wx0.a)) {
                        if (list.size() == 1) {
                            yx0Var = yx0.e;
                        }
                    } else if (!(xx0Var instanceof vx0)) {
                        h9o.p();
                        return;
                    } else {
                        int i = ((vx0) xx0Var).a;
                        yx0Var = 1000 <= i ? i < 1201 ? yx0.g : yx0.h : yx0.i;
                    }
                    z3 = true;
                } else {
                    yx0Var = z3 ? yx0.f : z4 ? z5 ? yx0.d : yx0.b : yx0.c;
                }
            }
        }
        yv4Var.d(y1j.g(new m2m(y1j.c(new m2m(y1j.c(new d82(by0.g, (byte) 1), new q3(list, yx0Var, (byte) 6)), new q3(this.d, list, (byte) 7)), new tx0(str, (byte) 0)), new y2((byte) 23))));
    }
}
