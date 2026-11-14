package defpackage;

import com.leanplum.messagetemplates.OperaSheetRequest;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class xnf implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaSheetRequest b;
    public final /* synthetic */ oqh c;

    public /* synthetic */ xnf(OperaSheetRequest operaSheetRequest, oqh oqhVar, byte b) {
        this.a = b;
        this.b = operaSheetRequest;
        this.c = oqhVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        oqh oqhVar = this.c;
        OperaSheetRequest operaSheetRequest = this.b;
        k9c k9cVar = (k9c) obj;
        switch (b) {
            case 0:
                OperaSheetRequest.createSheet$lambda$1(operaSheetRequest, oqhVar, k9cVar);
                break;
            case 1:
                OperaSheetRequest.createSheet$lambda$3(operaSheetRequest, oqhVar, k9cVar);
                break;
            default:
                OperaSheetRequest.createSheet$lambda$4(operaSheetRequest, oqhVar, k9cVar);
                break;
        }
    }
}
