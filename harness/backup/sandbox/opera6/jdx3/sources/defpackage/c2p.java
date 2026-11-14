package defpackage;

import android.webkit.URLUtil;
import java.io.File;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c2p extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ y2p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2p(y2p y2pVar, byte b) {
        super(0);
        this.i = b;
        this.j = y2pVar;
    }

    public final Object invoke() {
        byte b = this.i;
        y2p y2pVar = this.j;
        switch (b) {
            case 0:
                ehc ehcVarB = a.b();
                ehcVarB.addAll((List) y2pVar.z.t.getValue());
                List listB = super/*voo*/.b();
                if (listB != null) {
                    ehcVarB.addAll(listB);
                }
                return a.a(ehcVarB);
            case 1:
                ehc ehcVarB2 = a.b();
                ehcVarB2.addAll((List) y2pVar.z.r.getValue());
                List listC = super/*voo*/.c();
                if (listC != null) {
                    ehcVarB2.addAll(listC);
                }
                return a.a(ehcVarB2);
            case 2:
                ehc ehcVarB3 = a.b();
                ehcVarB3.addAll((List) y2pVar.z.q.getValue());
                List listD = super/*voo*/.d();
                if (listD != null) {
                    ehcVarB3.addAll(listD);
                }
                return a.a(ehcVarB3);
            case 3:
                String str = (String) y2pVar.z.k.getValue();
                if (str == null) {
                    return null;
                }
                String strGuessFileName = URLUtil.guessFileName(str, null, null);
                if (strGuessFileName == null) {
                    strGuessFileName = "download.ico";
                }
                File file = y2pVar.x;
                return new sro(file != null ? file : null, strGuessFileName, str);
            default:
                String str2 = (String) y2pVar.z.j.getValue();
                if (str2 == null) {
                    return null;
                }
                String strGuessFileName2 = URLUtil.guessFileName(str2, null, null);
                if (strGuessFileName2 == null) {
                    strGuessFileName2 = "download.main";
                }
                File file2 = y2pVar.x;
                return new sro(file2 != null ? file2 : null, strGuessFileName2, str2);
        }
    }
}
