package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zpa implements o27, ee5, tad, zl2, j0n, iuj, b42, y44 {
    public static final zpa b = new zpa(1);
    public static final vk2 c = new vk2(7);
    public static final zpa d = new zpa(3);
    public static final zpa e = new zpa(4);
    public static final zpa f = new zpa(6);
    public static final zpa g = new zpa(7);
    public static final wqf h = new wqf((byte) 1);
    public static final wqf i = new wqf((byte) 0);
    public static final zpa j = new zpa(10);
    public static final zpa k = new zpa(11);
    public static final zpa l = new zpa(12);
    public static final w3o m = new w3o();
    public final /* synthetic */ byte a;

    public /* synthetic */ zpa(byte b2) {
        this.a = b2;
    }

    public static vh0 A() {
        return new vh0(2443, 1, 3);
    }

    public static ui0 B() {
        return new ui0(2443, -1, 2);
    }

    public static xi0 C() {
        return new xi0(2443, -1, 1);
    }

    public static bj0 D() {
        return new bj0(2443, 1, 7);
    }

    public static fj0 E() {
        return new fj0(2443, -1, 1);
    }

    public static x56 F() {
        x56 x56Var = new x56(2443, -1, 50);
        x56Var.p(2, -1, System.currentTimeMillis());
        return x56Var;
    }

    public static ol0 G() {
        return new ol0(2443, -1, 2);
    }

    public static do0 H() {
        return new do0(2443, -1, 1);
    }

    public static ro0 I() {
        return new ro0(2443, -1, 6);
    }

    public static yp0 J() {
        return new yp0(2443, -1, 4);
    }

    public static jq0 K() {
        return new jq0(2443, -1, 2);
    }

    public static kq0 L() {
        return new kq0(2443, -1, 8);
    }

    public static or0 M() {
        return new or0(2443, -1, 4);
    }

    public static qu0 N() {
        return new qu0(2443, 1, 4);
    }

    public static sug O(h4k h4kVar, bqo bqoVar) {
        if (Intrinsics.a(h4kVar, f4k.a)) {
            return qug.a;
        }
        if (Intrinsics.a(h4kVar, a4k.a)) {
            return hug.a;
        }
        if (Intrinsics.a(h4kVar, b4k.a)) {
            return iug.a;
        }
        if (Intrinsics.a(h4kVar, c4k.a)) {
            return kug.a;
        }
        boolean z = h4kVar instanceof d4k;
        lug lugVar = lug.a;
        if (z) {
            return new pug(new k3k(bqoVar), lugVar);
        }
        if (Intrinsics.a(h4kVar, e4k.a)) {
            return lugVar;
        }
        if (Intrinsics.a(h4kVar, g4k.a)) {
            return rug.a;
        }
        h9o.p();
        return null;
    }

    public static aia Q(String str) {
        for (aia aiaVar : aia.values()) {
            if (aiaVar != aia.b && str.equals(aiaVar.a)) {
                return aiaVar;
            }
        }
        return aia.b;
    }

    public static bia R(String str) {
        for (bia biaVar : bia.values()) {
            if (biaVar != bia.b && str.equals(biaVar.a)) {
                return biaVar;
            }
        }
        return bia.b;
    }

    public static tja S(String str) {
        for (tja tjaVar : tja.values()) {
            if (tjaVar != tja.b && str.equals(tjaVar.a)) {
                return tjaVar;
            }
        }
        return tja.b;
    }

    public static nka T(String str) {
        for (nka nkaVar : nka.values()) {
            if (nkaVar != nka.b && str.equals(nkaVar.a)) {
                return nkaVar;
            }
        }
        return nka.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void U(orb orbVar, u02 u02Var, zy9 zy9Var) {
        qx8 qx8Var;
        gsb gsbVarO = kfo.O(orbVar);
        try {
            String strE = orbVar.e("method");
            byte b2 = 0;
            int i2 = 0;
            switch (strE.hashCode()) {
                case -1793304894:
                    if (strE.equals("encryption.v1.setEncryptionKey")) {
                        kfo.W(orbVar).c(0).e("key");
                        u02Var.getClass();
                        throw new IllegalStateException("");
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1581215258:
                    if (strE.equals("actions.v1.fillInputBox")) {
                        orb orbVarC = kfo.W(orbVar).c(0);
                        u02Var.f(orbVarC.d("id"), orbVarC.e("prompt"), c(orbVarC.c("action")), new fka(gsbVarO, zy9Var, (byte) 15));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1580116796:
                    if (strE.equals("actions.v1.imageActions")) {
                        orb orbVarC2 = kfo.W(orbVar).c(0);
                        u02Var.j(orbVarC2.e("imageUrl"), Q(orbVarC2.e("action")), new fka(gsbVarO, zy9Var, (byte) 10));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1555077015:
                    if (strE.equals("storage.v1.getItem")) {
                        u02Var.L(kfo.W(orbVar).c(0).e("key"), new fka(gsbVarO, zy9Var, b2));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1540465245:
                    if (strE.equals("actions.v1.startSpeechOutput")) {
                        u02Var.s(kfo.W(orbVar).c(0).e("text"), new fka(gsbVarO, zy9Var, (byte) 4));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1461924277:
                    if (strE.equals("actions.v1.createNewSearchTab")) {
                        u02Var.d(kfo.W(orbVar).c(0).d("id"), new fka(gsbVarO, zy9Var, (byte) 17));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1447189234:
                    if (strE.equals("actions.v1.getCrashId")) {
                        u02Var.g(new fka(gsbVarO, zy9Var, (byte) 12));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1268616645:
                    if (strE.equals("analytics.v1.reportEvent")) {
                        u02Var.w(e(kfo.W(orbVar).c(0).c(Constants.Params.EVENT)), new fka(gsbVarO, zy9Var, (byte) 25));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1182168694:
                    if (strE.equals("actions.v1.openFaq")) {
                        u02Var.l(R(kfo.W(orbVar).c(0).e("variant")), new fka(gsbVarO, zy9Var, (byte) 7));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -1072172111:
                    if (strE.equals("chat.v1.getChat")) {
                        u02Var.C(kfo.W(orbVar).c(0).d("id"), new gka(gsbVarO, zy9Var, b2));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -947447789:
                    if (strE.equals("chat.v1.deleteChatItem")) {
                        orb orbVarC3 = kfo.W(orbVar).c(0);
                        u02Var.B(orbVarC3.d("chatId"), orbVarC3.d("chatItemId"), new gka(gsbVarO, zy9Var, (byte) 3));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -562984741:
                    if (strE.equals("utility.v1.getShortUrls")) {
                        orb orbVarC4 = kfo.W(orbVar).c(0);
                        ArrayList arrayList = new ArrayList();
                        vpb vpbVarB = orbVarC4.b("urls");
                        int length = vpbVarB.a.length();
                        while (b2 < length) {
                            arrayList.add(vpbVarB.d(b2));
                            b2++;
                        }
                        u02Var.P(arrayList, new fka(gsbVarO, zy9Var, (byte) 24));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -560147556:
                    if (strE.equals("authentication.v1.getAccessToken")) {
                        u02Var.x(new gka(gsbVarO, zy9Var, (byte) 5));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -508427977:
                    if (strE.equals("actions.v1.pauseSpeechOutput")) {
                        u02Var.o(new fka(gsbVarO, zy9Var, (byte) 8));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -349606329:
                    if (strE.equals("actions.v1.stopSpeechOutput")) {
                        u02Var.t(new fka(gsbVarO, zy9Var, (byte) 9));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -290675593:
                    if (strE.equals("authentication.v1.refreshAccessToken")) {
                        u02Var.z(new gka(gsbVarO, zy9Var, (byte) 6));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case -17210536:
                    if (strE.equals("actions.v1.giveFeedback")) {
                        orb orbVarC5 = kfo.W(orbVar).c(0).c("feedback");
                        String strE2 = orbVarC5.e("feedbackType");
                        qx8[] qx8VarArrValues = qx8.values();
                        int length2 = qx8VarArrValues.length;
                        while (true) {
                            if (i2 >= length2) {
                                qx8Var = qx8.b;
                            } else {
                                qx8Var = qx8VarArrValues[i2];
                                if (qx8Var == qx8.b || !Intrinsics.a(strE2, qx8Var.a)) {
                                    i2++;
                                }
                            }
                        }
                        u02Var.h(new nx8(qx8Var, orbVarC5.e("conversationId"), orbVarC5.e(Constants.Params.MESSAGE_ID)), new fka(gsbVarO, zy9Var, (byte) 6));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 38137934:
                    if (strE.equals("encryption.v1.getEncryptionKey")) {
                        u02Var.G(new fka(gsbVarO, zy9Var, (byte) 26));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 73547920:
                    if (strE.equals("actions.v1.openChatHistory")) {
                        u02Var.k(new fka(gsbVarO, zy9Var, (byte) 19));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 85730266:
                    if (strE.equals("actions.v1.openInputFile")) {
                        u02Var.m(kfo.W(orbVar).c(0).e("id"), new fka(gsbVarO, zy9Var, (byte) 20));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 295898945:
                    if (strE.equals("message.v1.appendMessageStream")) {
                        orb orbVarC6 = kfo.W(orbVar).c(0);
                        u02Var.K(orbVarC6.e("streamId"), orbVarC6.e("text"), T(orbVarC6.e(Constants.Params.TYPE)), new fka(gsbVarO, zy9Var, (byte) 27));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 458151127:
                    if (strE.equals("storage.v1.removeItem")) {
                        u02Var.M(kfo.W(orbVar).c(0).e("key"), new fka(gsbVarO, zy9Var, (byte) 2));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 505032565:
                    if (strE.equals("storage.v1.setItem")) {
                        orb orbVarC7 = kfo.W(orbVar).c(0);
                        u02Var.N(orbVarC7.e("key"), orbVarC7.e(Constants.Params.VALUE), new fka(gsbVarO, zy9Var, (byte) 14));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 531780676:
                    if (strE.equals("actions.v1.consentToAriaTermsAndConditions")) {
                        u02Var.b(new fka(gsbVarO, zy9Var, (byte) 13));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 542549494:
                    if (strE.equals("actions.v1.openTabGroup")) {
                        orb orbVarC8 = kfo.W(orbVar).c(0);
                        ArrayList arrayList2 = new ArrayList();
                        vpb vpbVarB2 = orbVarC8.b("urls");
                        int length3 = vpbVarB2.a.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            arrayList2.add(vpbVarB2.d(i3));
                        }
                        u02Var.n(arrayList2, orbVarC8.e("title"), new fka(gsbVarO, zy9Var, (byte) 18));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 580622560:
                    if (strE.equals("chat.v1.deleteChat")) {
                        u02Var.A(kfo.W(orbVar).c(0).d("id"), new gka(gsbVarO, zy9Var, (byte) 1));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 612612887:
                    if (strE.equals("actions.v1.copy")) {
                        u02Var.c(kfo.W(orbVar).c(0).e("text"), new gka(gsbVarO, zy9Var, (byte) 9));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 626014444:
                    if (strE.equals("authentication.v1.login")) {
                        u02Var.y(S(kfo.W(orbVar).c(0).e("method")), new gka(gsbVarO, zy9Var, (byte) 4));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 758845642:
                    if (strE.equals("actions.v1.search")) {
                        u02Var.p(f(kfo.W(orbVar).c(0).c("target")), new gka(gsbVarO, zy9Var, (byte) 8));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 987937469:
                    if (strE.equals("chat.v1.setChat")) {
                        u02Var.D(p37.x(kfo.W(orbVar).c(0).c("chat")), new gka(gsbVarO, zy9Var, (byte) 2));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1080297359:
                    if (strE.equals("actions.v1.showContextMenu")) {
                        orb orbVarC9 = kfo.W(orbVar).c(0);
                        ArrayList arrayList3 = new ArrayList();
                        vpb vpbVarB3 = orbVarC9.b("actions");
                        int length4 = vpbVarB3.a.length();
                        for (int i4 = 0; i4 < length4; i4++) {
                            arrayList3.add(fr3.y(vpbVarB3.c(i4)));
                        }
                        JSONObject jSONObject = orbVarC9.c("positon").a;
                        new iia(jSONObject.getLong("clientX"), jSONObject.getLong("clientY"));
                        fka fkaVar = new fka(gsbVarO, zy9Var, (byte) 16);
                        u02Var.getClass();
                        u02.r(fkaVar);
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1098908528:
                    if (strE.equals("chat.v1.setChatItem")) {
                        u02Var.E(ujp.j(kfo.W(orbVar).c(0).c("chatItem")), new fka(gsbVarO, zy9Var, (byte) 22));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1122403042:
                    if (strE.equals("chat.v1.getChats")) {
                        fka fkaVar2 = new fka(gsbVarO, zy9Var, (byte) 29);
                        ((d12) ((wth) u02Var.b).b).c(new ra(new z3(u02Var, fkaVar2), (byte) 4));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1187488356:
                    if (strE.equals("chat.v1.getChatItem")) {
                        orb orbVarC10 = kfo.W(orbVar).c(0);
                        ((wth) u02Var.b).z(orbVarC10.d("chatId"), orbVarC10.d("chatItemId"), new t02(u02Var, new fka(gsbVarO, zy9Var, (byte) 11), (byte) 3));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1336887112:
                    if (strE.equals("views.v1.notifyAriaStateChanged")) {
                        u42 u42VarP = gyg.p(kfo.W(orbVar).c(0).c(Constants.Params.STATE));
                        fka fkaVar3 = new fka(gsbVarO, zy9Var, (byte) 23);
                        u02Var.getClass();
                        try {
                            ((ab) u02Var.e).run(u42VarP);
                            fkaVar3.n(new sw7(Unit.a));
                            return;
                        } catch (Throwable th) {
                            fkaVar3.n(new rw7(new dqb(th)));
                            return;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1811039894:
                    if (strE.equals("actions.v1.close")) {
                        fka fkaVar4 = new fka(gsbVarO, zy9Var, (byte) 1);
                        u02Var.getClass();
                        try {
                            zz1 zz1Var = (zz1) u02Var.o;
                            if (zz1Var != null) {
                                zz1Var.b();
                            }
                            fkaVar4.n(new sw7(Unit.a));
                            return;
                        } catch (Throwable th2) {
                            fkaVar4.n(new rw7(new dqb(th2)));
                            return;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1825683581:
                    if (strE.equals("actions.v1.share")) {
                        u02Var.q(kfo.W(orbVar).c(0).e("text"), new fka(gsbVarO, zy9Var, (byte) 3));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1855238694:
                    if (strE.equals("views.v1.getHostState")) {
                        u02Var.Q(new fka(gsbVarO, zy9Var, (byte) 21));
                        return;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 1910030180:
                    if (strE.equals("actions.v2.startSpeechOutput")) {
                        orb orbVarC11 = kfo.W(orbVar).c(0);
                        String strE3 = orbVarC11.e("streamId");
                        String strM = orbVarC11.m("text", null);
                        gka gkaVar = new gka(gsbVarO, zy9Var, (byte) 7);
                        u02Var.getClass();
                        try {
                            u02Var.u(strE3, strM);
                            gkaVar.n(new sw7(Unit.a));
                            return;
                        } catch (Throwable th3) {
                            gkaVar.n(new rw7(new dqb(th3)));
                            return;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 2007662598:
                    if (strE.equals("actions.v1.openLink")) {
                        String strE4 = kfo.W(orbVar).c(0).e(ImagesContract.URL);
                        fka fkaVar5 = new fka(gsbVarO, zy9Var, (byte) 5);
                        u02Var.getClass();
                        try {
                            zz1 zz1Var2 = (zz1) u02Var.o;
                            if (zz1Var2 != null) {
                                zz1Var2.d(strE4, true);
                            }
                            fkaVar5.n(new sw7(Unit.a));
                            return;
                        } catch (Throwable th4) {
                            fkaVar5.n(new rw7(new dqb(th4)));
                            return;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                case 2076402787:
                    if (strE.equals("file.v1.getInfo")) {
                        String strE5 = kfo.W(orbVar).c(0).e("id");
                        fka fkaVar6 = new fka(gsbVarO, zy9Var, (byte) 28);
                        u02Var.getClass();
                        try {
                            fkaVar6.n(new sw7(u02Var.H(strE5)));
                            return;
                        } catch (Throwable th5) {
                            fkaVar6.n(new rw7(new dqb(th5)));
                            return;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
                default:
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), zy9Var);
                    return;
            }
        } catch (Throwable th6) {
            dqb dqbVar = new dqb(th6);
            try {
                orbVar.e("method");
            } catch (JSONException unused) {
            }
            kfo.F(gsbVarO, dqbVar, zy9Var);
        }
    }

    public static cc V(String str) {
        Object next;
        h58 h58Var = cc.e;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            if (!w4VarE.hasNext()) {
                next = null;
                break;
            }
            next = w4VarE.next();
            if (Intrinsics.a(((cc) next).name(), str)) {
                break;
            }
        }
        return (cc) next;
    }

    public static vec W(List list) {
        return new vec(list, (ArrayList) null, Float.floatToRawIntBits(0.0f) & 4294967295L, Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L, 0);
    }

    public static mha c(orb orbVar) throws JSONException {
        lha lhaVar;
        JSONObject jSONObject = orbVar.a;
        if (!jSONObject.has(Constants.Params.TYPE)) {
            if (!jSONObject.has("action")) {
                return new nha();
            }
            orbVar.e("action");
            return new jha(orbVar.e(ImagesContract.URL));
        }
        String strE = orbVar.e(Constants.Params.TYPE);
        lha[] lhaVarArrValues = lha.values();
        int length = lhaVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                lhaVar = lhaVarArrValues[i2];
                if (lhaVar != lha.b && strE.equals(lhaVar.a)) {
                    break;
                }
                i2++;
            } else {
                lhaVar = lha.b;
                break;
            }
        }
        return new kha(lhaVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static oka e(orb orbVar) throws JSONException {
        via viaVar;
        nja njaVar;
        tia tiaVar;
        aja ajaVar;
        zia ziaVar;
        dja djaVar;
        String strE = orbVar.e(Constants.Params.TYPE);
        JSONObject jSONObject = orbVar.a;
        int i2 = 0;
        switch (strE.hashCode()) {
            case -2140837985:
                if (strE.equals("odds-click")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE2 = orbVar.e("oddsType");
                    jja[] jjaVarArrValues = jja.values();
                    int length = jjaVarArrValues.length;
                    while (true) {
                        if (i2 >= length) {
                            jja jjaVar = jja.b;
                        } else {
                            jja jjaVar2 = jjaVarArrValues[i2];
                            if (jjaVar2 == jja.b || !strE2.equals(jjaVar2.a)) {
                                i2++;
                            }
                        }
                    }
                    jSONObject.getLong("id");
                    orbVar.e(Constants.Params.NAME);
                    return new ija();
                }
                break;
            case -2050560136:
                if (strE.equals("linkified-links-click")) {
                    orbVar.e(Constants.Params.TYPE);
                    orbVar.e("query");
                    orbVar.e("category");
                    return new wia();
                }
                break;
            case -1865830795:
                if (strE.equals("odds-provider-click")) {
                    orbVar.e(Constants.Params.TYPE);
                    jSONObject.getLong("id");
                    orbVar.e(Constants.Params.NAME);
                    orbVar.e("providerId");
                    return new kja();
                }
                break;
            case -1772895717:
                if (strE.equals("conversation-chip-interaction")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE3 = orbVar.e("id");
                    String strE4 = orbVar.e("category");
                    String strE5 = orbVar.e("interaction");
                    via[] viaVarArrValues = via.values();
                    int length2 = viaVarArrValues.length;
                    while (true) {
                        if (i2 >= length2) {
                            viaVar = via.b;
                        } else {
                            viaVar = viaVarArrValues[i2];
                            if (viaVar == via.b || !strE5.equals(viaVar.a)) {
                                i2++;
                            }
                        }
                    }
                    return new uia(strE3, strE4, viaVar);
                }
                break;
            case -1734221157:
                if (strE.equals("simple-reported-event")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE6 = orbVar.e(Constants.Params.EVENT);
                    nja[] njaVarArrValues = nja.values();
                    int length3 = njaVarArrValues.length;
                    while (true) {
                        if (i2 >= length3) {
                            njaVar = nja.UNDEFINED;
                        } else {
                            njaVar = njaVarArrValues[i2];
                            if (njaVar == nja.UNDEFINED || !strE6.equals(njaVar.a)) {
                                i2++;
                            }
                        }
                    }
                    return new mja(njaVar);
                }
                break;
            case -1387195370:
                if (strE.equals("aria-response-measure")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE7 = orbVar.e("responseType");
                    tia[] tiaVarArrValues = tia.values();
                    int length4 = tiaVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length4) {
                            tiaVar = tia.b;
                        } else {
                            tiaVar = tiaVarArrValues[i3];
                            if (tiaVar == tia.b || !strE7.equals(tiaVar.a)) {
                                i3++;
                            }
                        }
                    }
                    tia tiaVar2 = tiaVar;
                    String strE8 = orbVar.e(Constants.Params.MESSAGE_ID);
                    long j2 = jSONObject.getLong(Constants.Params.TIME);
                    String strE9 = orbVar.e("messageType");
                    jSONObject.getLong("numOfFiles");
                    String strM = orbVar.m("dataReceivesFromShodan", null);
                    String strM2 = orbVar.m("apiVersion", null);
                    if (strM2 != null) {
                        ria[] riaVarArrValues = ria.values();
                        int length5 = riaVarArrValues.length;
                        while (true) {
                            if (i2 >= length5) {
                                ria riaVar = ria.b;
                            } else {
                                ria riaVar2 = riaVarArrValues[i2];
                                if (riaVar2 == ria.b || !strM2.equals(riaVar2.a)) {
                                    i2++;
                                }
                            }
                        }
                    }
                    return new sia(tiaVar2, strE8, j2, strE9, strM);
                }
                break;
            case -1332290146:
                if (strE.equals("message-sent")) {
                    orbVar.e(Constants.Params.TYPE);
                    return new fja(orbVar.e("messageType"));
                }
                break;
            case 103149417:
                if (strE.equals("login")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE10 = orbVar.e("loginType");
                    aja[] ajaVarArrValues = aja.values();
                    int length6 = ajaVarArrValues.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length6) {
                            ajaVar = aja.UNDEFINED;
                        } else {
                            ajaVar = ajaVarArrValues[i4];
                            if (ajaVar == aja.UNDEFINED || !strE10.equals(ajaVar.a)) {
                                i4++;
                            }
                        }
                    }
                    String strE11 = orbVar.e("loginReason");
                    zia[] ziaVarArrValues = zia.values();
                    int length7 = ziaVarArrValues.length;
                    while (true) {
                        if (i2 >= length7) {
                            ziaVar = zia.UNDEFINED;
                        } else {
                            ziaVar = ziaVarArrValues[i2];
                            if (ziaVar == zia.UNDEFINED || !strE11.equals(ziaVar.a)) {
                                i2++;
                            }
                        }
                    }
                    return new yia(ajaVar, ziaVar);
                }
                break;
            case 716946721:
                if (strE.equals("more-info-click")) {
                    orbVar.e(Constants.Params.TYPE);
                    orbVar.m("category", null);
                    return new gja();
                }
                break;
            case 1230139920:
                if (strE.equals("more-info-impression")) {
                    orbVar.e(Constants.Params.TYPE);
                    orbVar.m("category", null);
                    return new hja();
                }
                break;
            case 1432322797:
                if (strE.equals("login-impression")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE12 = orbVar.e("loginReason");
                    cja[] cjaVarArrValues = cja.values();
                    int length8 = cjaVarArrValues.length;
                    while (true) {
                        if (i2 >= length8) {
                            cja cjaVar = cja.b;
                        } else {
                            cja cjaVar2 = cjaVarArrValues[i2];
                            if (cjaVar2 == cja.b || !strE12.equals(cjaVar2.a)) {
                                i2++;
                            }
                        }
                    }
                    return new bja();
                }
                break;
            case 1663531076:
                if (strE.equals("linkify-count")) {
                    orbVar.e(Constants.Params.TYPE);
                    return new xia(jSONObject.getLong(Constants.Params.COUNT));
                }
                break;
            case 1923757372:
                if (strE.equals("odds-provider-impression")) {
                    orbVar.e(Constants.Params.TYPE);
                    jSONObject.getLong("id");
                    orbVar.e(Constants.Params.NAME);
                    orbVar.e("providerId");
                    return new lja();
                }
                break;
            case 2116357452:
                if (strE.equals("message-interaction")) {
                    orbVar.e(Constants.Params.TYPE);
                    String strE13 = orbVar.e("messageType");
                    String strE14 = orbVar.e("action");
                    dja[] djaVarArrValues = dja.values();
                    int length9 = djaVarArrValues.length;
                    while (true) {
                        if (i2 >= length9) {
                            djaVar = dja.UNDEFINED;
                        } else {
                            djaVar = djaVarArrValues[i2];
                            if (djaVar == dja.UNDEFINED || !strE14.equals(djaVar.a)) {
                                i2++;
                            }
                        }
                    }
                    return new eja(strE13, djaVar);
                }
                break;
        }
        return new pka();
    }

    public static qka f(orb orbVar) throws JSONException {
        JSONObject jSONObject = orbVar.a;
        if (jSONObject.has("query")) {
            orbVar.e(Constants.Params.TYPE);
            String strE = orbVar.e("query");
            orbVar.e("category");
            return new gia(strE);
        }
        if (!jSONObject.has("searchTerm")) {
            return new rka();
        }
        orbVar.e(Constants.Params.TYPE);
        orbVar.e("searchTerm");
        orbVar.e("searchUrl");
        return new hia();
    }

    public static w50 g() {
        return new w50(2443, -1, 1);
    }

    public static z50 h() {
        return new z50(2443, -1, 1);
    }

    public static i60 m() {
        return new i60(2443, -1, 12);
    }

    public static y60 p() {
        return new y60(2443, -1, 7);
    }

    public static z70 q() {
        return new z70(2443, -1, 2);
    }

    public static n80 s() {
        return new n80(2443, -1, 1);
    }

    public static p80 t() {
        return new p80(2443, -1, 1);
    }

    public static s80 u() {
        return new s80(2443, -1, 1);
    }

    public static ha0 v() {
        return new ha0(2443, -1, 3);
    }

    public static na0 w() {
        return new na0(2443, -1, 1);
    }

    public static bb0 x() {
        return new bb0(2443, -1, 1);
    }

    public static hd0 y() {
        return new hd0(2443, 1, 4);
    }

    public static ge0 z() {
        return new ge0(2443, -1, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(jg8 r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vv0
            if (r0 == 0) goto L13
            r0 = r7
            vv0 r0 = (vv0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vv0 r0 = new vv0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.t
            px5 r7 = px5.a
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ybh.y(r5)
            return r5
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r2
        L2e:
            ybh.y(r5)
            wv0 r5 = new wv0
            r1 = 2
            r4 = 0
            r5.<init>(r1, r2, r4)
            r0.v = r3
            java.lang.Object r5 = na2.Z(r6, r5, r0)
            if (r5 != r7) goto L41
            return r7
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpa.P(jg8, nt5):java.lang.Object");
    }

    @Override // defpackage.b42
    public final orb a() {
        return vep.p(Constants.Params.TYPE, "search");
    }

    public final float b(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final byte[] copyFrom(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    public final int d() {
        return 2;
    }

    public final void i(uad uadVar, sad sadVar, Object obj) {
    }

    public final sad j(uad uadVar, Object obj, int i2, sad sadVar) {
        dbd dbdVar = (dbd) uadVar;
        cbd cbdVar = (cbd) sadVar;
        return cbdVar == null ? new cbd(dbdVar.g, obj, i2) : new bbd(dbdVar.g, obj, i2, cbdVar);
    }

    public final uad k(fbd fbdVar, int i2) {
        return new dbd(fbdVar, i2);
    }

    public final sad l(uad uadVar, sad sadVar, sad sadVar2) {
        dbd dbdVar = (dbd) uadVar;
        cbd cbdVar = (cbd) sadVar;
        cbd cbdVar2 = (cbd) sadVar2;
        Object obj = cbdVar.get();
        if (obj == null) {
            return null;
        }
        int i2 = cbdVar.a;
        return cbdVar2 == null ? new cbd(dbdVar.g, obj, i2) : new bbd(dbdVar.g, obj, i2, cbdVar2);
    }

    public final Object n(esb esbVar, float f2) {
        boolean z = esbVar.t() == 1;
        if (z) {
            esbVar.h();
        }
        float fQ = (float) esbVar.q();
        float fQ2 = (float) esbVar.q();
        while (esbVar.o()) {
            esbVar.H();
        }
        if (z) {
            esbVar.l();
        }
        return new nli((fQ / 100.0f) * f2, (fQ2 / 100.0f) * f2);
    }

    public final boolean o(Object obj, Object obj2) {
        return Intrinsics.a(obj, obj2);
    }

    public final Object r(x79 x79Var) {
        return fr3.I((Executor) x79Var.h(new qfh(bec.class, Executor.class)));
    }

    public final String toString() {
        switch (this.a) {
            case 11:
                return "StructuralEqualityPolicy";
            case 29:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
