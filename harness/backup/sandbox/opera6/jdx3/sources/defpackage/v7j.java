package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v7j extends pde {
    public final u7j l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ SettingsManager n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [u7j] */
    public v7j(final String str, final Function1 function1, final SettingsManager settingsManager, Object obj) {
        super(obj);
        this.m = function1;
        this.n = settingsManager;
        final byte b = 1;
        this.l = new p5j() { // from class: u7j
            @Override // defpackage.p5j
            public final void M(String str2) {
                byte b2 = b;
                SettingsManager settingsManager2 = settingsManager;
                Function1 function12 = function1;
                Object obj2 = this;
                String str3 = str;
                switch (b2) {
                    case 0:
                        z1h z1hVar = (z1h) obj2;
                        Function2 function2 = (Function2) function12;
                        if (str2.equals(str3)) {
                            z1hVar.b(function2.invoke(str3, settingsManager2));
                            break;
                        }
                        break;
                    default:
                        v7j v7jVar = (v7j) obj2;
                        Function1 function13 = function12;
                        if (str3.equals(str2)) {
                            xf8.F0(v7jVar, function13.invoke(settingsManager2));
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final void l() {
        Function1 function1 = this.m;
        SettingsManager settingsManager = this.n;
        r(function1.invoke(settingsManager));
        settingsManager.F(this.l);
    }

    public final void m() {
        this.n.H(this.l);
    }
}
