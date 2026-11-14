package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class at implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ct b;

    public /* synthetic */ at(ct ctVar, byte b) {
        this.a = b;
        this.b = ctVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ct ctVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(ctVar.G0().f.i("speed_dial.large_icons"));
            case 1:
                return Boolean.valueOf(ctVar.G0().f.i("speed_dial.large_icons"));
            case 2:
                wk9 wk9Var = ctVar.s;
                return (RecyclerView) (wk9Var != null ? wk9Var : null).g;
            case 3:
                wk9 wk9Var2 = ctVar.s;
                return (RecyclerView) (wk9Var2 != null ? wk9Var2 : null).h;
            case 4:
                wk9 wk9Var3 = ctVar.s;
                return (RecyclerView) (wk9Var3 != null ? wk9Var3 : null).e;
            case 5:
                wk9 wk9Var4 = ctVar.s;
                return (RecyclerView) (wk9Var4 != null ? wk9Var4 : null).f;
            case 6:
                wk9 wk9Var5 = ctVar.s;
                return (RecyclerView) (wk9Var5 != null ? wk9Var5 : null).i;
            default:
                wk9 wk9Var6 = ctVar.s;
                return (RecyclerView) (wk9Var6 != null ? wk9Var6 : null).d;
        }
    }
}
