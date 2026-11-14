package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w3j {
    public final Collection a;
    public final boolean b;
    public final zyk c;
    public final zyk d;
    public final zyk e;
    public final zyk f;
    public final zyk g;

    public w3j(Collection collection, boolean z) {
        this.a = collection;
        this.b = z;
        final byte b = 0;
        this.c = z4c.b(new Function0(this) { // from class: v3j
            public final /* synthetic */ w3j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                int i = 0;
                w3j w3jVar = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (qrm qrmVar : w3jVar.a) {
                            arrayList.add(w3jVar.b ? qrmVar.q : qrmVar.r);
                            arrayList2.add(qrmVar.h);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (((u3j) obj).g.c == 5) {
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        an2 an2Var = jgk.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList.get(i3);
                                i3++;
                                u3j u3jVar = (u3j) obj2;
                                if (u3jVar.g.b.a.containsKey(an2Var) && u3jVar.b().size() != 1) {
                                    if (gyg.G(6, "CXCP")) {
                                        u3jVar.b().size();
                                        break;
                                    }
                                } else if (u3jVar.g.b.a.containsKey(an2Var)) {
                                    int size3 = arrayList.size();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj3 = arrayList.get(i5);
                                        i5++;
                                        u3j u3jVar2 = (u3j) obj3;
                                        if (((qsm) arrayList3.get(i4)).C() == ssm.f) {
                                            jpo.n("MeteringRepeating should contain a surface", !u3jVar2.b().isEmpty());
                                            linkedHashMap.put(u3jVar2.b().get(0), 1L);
                                        } else if (u3jVar2.g.b.a.containsKey(an2Var) && !u3jVar2.b().isEmpty()) {
                                            linkedHashMap.put(u3jVar2.b().get(0), u3jVar2.g.b.i(an2Var));
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<qrm> collection2 = w3jVar.a;
                        ArrayList arrayList4 = new ArrayList(k95.o(collection2, 10));
                        for (qrm qrmVar2 : collection2) {
                            arrayList4.add(w3jVar.b ? qrmVar2.q : qrmVar2.r);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            u3j u3jVar3 = (u3j) obj4;
                            List<g07> listB = u3jVar3.b();
                            ai4 ai4Var = u3jVar3.g;
                            for (g07 g07Var : listB) {
                                wrf wrfVar = ai4Var.b;
                                an2 an2Var2 = eb4.j;
                                if (!wrfVar.a.containsKey(an2Var2) || wrfVar.i(an2Var2) == null) {
                                    linkedHashMap2.put(g07Var, Long.valueOf(Intrinsics.a(g07Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(g07Var, wrfVar.i(an2Var2));
                                }
                            }
                        }
                        break;
                    case 2:
                        t3j t3jVar = new t3j();
                        for (qrm qrmVar3 : w3jVar.a) {
                            t3jVar.a(w3jVar.b ? qrmVar3.q : qrmVar3.r);
                        }
                        break;
                    case 3:
                        zyk zykVar = w3jVar.e;
                        if (((t3j) zykVar.getValue()).c()) {
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                    default:
                        zyk zykVar2 = w3jVar.f;
                        if (((t3j) w3jVar.e.getValue()).c()) {
                            po2 po2Var = ((u3j) zykVar2.getValue()).b;
                            if (po2Var != null) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(((u3j) zykVar2.getValue()).b());
                                arrayList5.add(po2Var.a);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final byte b2 = 1;
        this.d = z4c.b(new Function0(this) { // from class: v3j
            public final /* synthetic */ w3j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                int i = 0;
                w3j w3jVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (qrm qrmVar : w3jVar.a) {
                            arrayList.add(w3jVar.b ? qrmVar.q : qrmVar.r);
                            arrayList2.add(qrmVar.h);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (((u3j) obj).g.c == 5) {
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        an2 an2Var = jgk.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList.get(i3);
                                i3++;
                                u3j u3jVar = (u3j) obj2;
                                if (u3jVar.g.b.a.containsKey(an2Var) && u3jVar.b().size() != 1) {
                                    if (gyg.G(6, "CXCP")) {
                                        u3jVar.b().size();
                                        break;
                                    }
                                } else if (u3jVar.g.b.a.containsKey(an2Var)) {
                                    int size3 = arrayList.size();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj3 = arrayList.get(i5);
                                        i5++;
                                        u3j u3jVar2 = (u3j) obj3;
                                        if (((qsm) arrayList3.get(i4)).C() == ssm.f) {
                                            jpo.n("MeteringRepeating should contain a surface", !u3jVar2.b().isEmpty());
                                            linkedHashMap.put(u3jVar2.b().get(0), 1L);
                                        } else if (u3jVar2.g.b.a.containsKey(an2Var) && !u3jVar2.b().isEmpty()) {
                                            linkedHashMap.put(u3jVar2.b().get(0), u3jVar2.g.b.i(an2Var));
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<qrm> collection2 = w3jVar.a;
                        ArrayList arrayList4 = new ArrayList(k95.o(collection2, 10));
                        for (qrm qrmVar2 : collection2) {
                            arrayList4.add(w3jVar.b ? qrmVar2.q : qrmVar2.r);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            u3j u3jVar3 = (u3j) obj4;
                            List<g07> listB = u3jVar3.b();
                            ai4 ai4Var = u3jVar3.g;
                            for (g07 g07Var : listB) {
                                wrf wrfVar = ai4Var.b;
                                an2 an2Var2 = eb4.j;
                                if (!wrfVar.a.containsKey(an2Var2) || wrfVar.i(an2Var2) == null) {
                                    linkedHashMap2.put(g07Var, Long.valueOf(Intrinsics.a(g07Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(g07Var, wrfVar.i(an2Var2));
                                }
                            }
                        }
                        break;
                    case 2:
                        t3j t3jVar = new t3j();
                        for (qrm qrmVar3 : w3jVar.a) {
                            t3jVar.a(w3jVar.b ? qrmVar3.q : qrmVar3.r);
                        }
                        break;
                    case 3:
                        zyk zykVar = w3jVar.e;
                        if (((t3j) zykVar.getValue()).c()) {
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                    default:
                        zyk zykVar2 = w3jVar.f;
                        if (((t3j) w3jVar.e.getValue()).c()) {
                            po2 po2Var = ((u3j) zykVar2.getValue()).b;
                            if (po2Var != null) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(((u3j) zykVar2.getValue()).b());
                                arrayList5.add(po2Var.a);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final byte b3 = 2;
        this.e = z4c.b(new Function0(this) { // from class: v3j
            public final /* synthetic */ w3j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                int i = 0;
                w3j w3jVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (qrm qrmVar : w3jVar.a) {
                            arrayList.add(w3jVar.b ? qrmVar.q : qrmVar.r);
                            arrayList2.add(qrmVar.h);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (((u3j) obj).g.c == 5) {
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        an2 an2Var = jgk.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList.get(i3);
                                i3++;
                                u3j u3jVar = (u3j) obj2;
                                if (u3jVar.g.b.a.containsKey(an2Var) && u3jVar.b().size() != 1) {
                                    if (gyg.G(6, "CXCP")) {
                                        u3jVar.b().size();
                                        break;
                                    }
                                } else if (u3jVar.g.b.a.containsKey(an2Var)) {
                                    int size3 = arrayList.size();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj3 = arrayList.get(i5);
                                        i5++;
                                        u3j u3jVar2 = (u3j) obj3;
                                        if (((qsm) arrayList3.get(i4)).C() == ssm.f) {
                                            jpo.n("MeteringRepeating should contain a surface", !u3jVar2.b().isEmpty());
                                            linkedHashMap.put(u3jVar2.b().get(0), 1L);
                                        } else if (u3jVar2.g.b.a.containsKey(an2Var) && !u3jVar2.b().isEmpty()) {
                                            linkedHashMap.put(u3jVar2.b().get(0), u3jVar2.g.b.i(an2Var));
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<qrm> collection2 = w3jVar.a;
                        ArrayList arrayList4 = new ArrayList(k95.o(collection2, 10));
                        for (qrm qrmVar2 : collection2) {
                            arrayList4.add(w3jVar.b ? qrmVar2.q : qrmVar2.r);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            u3j u3jVar3 = (u3j) obj4;
                            List<g07> listB = u3jVar3.b();
                            ai4 ai4Var = u3jVar3.g;
                            for (g07 g07Var : listB) {
                                wrf wrfVar = ai4Var.b;
                                an2 an2Var2 = eb4.j;
                                if (!wrfVar.a.containsKey(an2Var2) || wrfVar.i(an2Var2) == null) {
                                    linkedHashMap2.put(g07Var, Long.valueOf(Intrinsics.a(g07Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(g07Var, wrfVar.i(an2Var2));
                                }
                            }
                        }
                        break;
                    case 2:
                        t3j t3jVar = new t3j();
                        for (qrm qrmVar3 : w3jVar.a) {
                            t3jVar.a(w3jVar.b ? qrmVar3.q : qrmVar3.r);
                        }
                        break;
                    case 3:
                        zyk zykVar = w3jVar.e;
                        if (((t3j) zykVar.getValue()).c()) {
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                    default:
                        zyk zykVar2 = w3jVar.f;
                        if (((t3j) w3jVar.e.getValue()).c()) {
                            po2 po2Var = ((u3j) zykVar2.getValue()).b;
                            if (po2Var != null) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(((u3j) zykVar2.getValue()).b());
                                arrayList5.add(po2Var.a);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final byte b4 = 3;
        this.f = z4c.b(new Function0(this) { // from class: v3j
            public final /* synthetic */ w3j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b4;
                int i = 0;
                w3j w3jVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (qrm qrmVar : w3jVar.a) {
                            arrayList.add(w3jVar.b ? qrmVar.q : qrmVar.r);
                            arrayList2.add(qrmVar.h);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (((u3j) obj).g.c == 5) {
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        an2 an2Var = jgk.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList.get(i3);
                                i3++;
                                u3j u3jVar = (u3j) obj2;
                                if (u3jVar.g.b.a.containsKey(an2Var) && u3jVar.b().size() != 1) {
                                    if (gyg.G(6, "CXCP")) {
                                        u3jVar.b().size();
                                        break;
                                    }
                                } else if (u3jVar.g.b.a.containsKey(an2Var)) {
                                    int size3 = arrayList.size();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj3 = arrayList.get(i5);
                                        i5++;
                                        u3j u3jVar2 = (u3j) obj3;
                                        if (((qsm) arrayList3.get(i4)).C() == ssm.f) {
                                            jpo.n("MeteringRepeating should contain a surface", !u3jVar2.b().isEmpty());
                                            linkedHashMap.put(u3jVar2.b().get(0), 1L);
                                        } else if (u3jVar2.g.b.a.containsKey(an2Var) && !u3jVar2.b().isEmpty()) {
                                            linkedHashMap.put(u3jVar2.b().get(0), u3jVar2.g.b.i(an2Var));
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<qrm> collection2 = w3jVar.a;
                        ArrayList arrayList4 = new ArrayList(k95.o(collection2, 10));
                        for (qrm qrmVar2 : collection2) {
                            arrayList4.add(w3jVar.b ? qrmVar2.q : qrmVar2.r);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            u3j u3jVar3 = (u3j) obj4;
                            List<g07> listB = u3jVar3.b();
                            ai4 ai4Var = u3jVar3.g;
                            for (g07 g07Var : listB) {
                                wrf wrfVar = ai4Var.b;
                                an2 an2Var2 = eb4.j;
                                if (!wrfVar.a.containsKey(an2Var2) || wrfVar.i(an2Var2) == null) {
                                    linkedHashMap2.put(g07Var, Long.valueOf(Intrinsics.a(g07Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(g07Var, wrfVar.i(an2Var2));
                                }
                            }
                        }
                        break;
                    case 2:
                        t3j t3jVar = new t3j();
                        for (qrm qrmVar3 : w3jVar.a) {
                            t3jVar.a(w3jVar.b ? qrmVar3.q : qrmVar3.r);
                        }
                        break;
                    case 3:
                        zyk zykVar = w3jVar.e;
                        if (((t3j) zykVar.getValue()).c()) {
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                    default:
                        zyk zykVar2 = w3jVar.f;
                        if (((t3j) w3jVar.e.getValue()).c()) {
                            po2 po2Var = ((u3j) zykVar2.getValue()).b;
                            if (po2Var != null) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(((u3j) zykVar2.getValue()).b());
                                arrayList5.add(po2Var.a);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final byte b5 = 4;
        this.g = z4c.b(new Function0(this) { // from class: v3j
            public final /* synthetic */ w3j b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b5;
                int i = 0;
                w3j w3jVar = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (qrm qrmVar : w3jVar.a) {
                            arrayList.add(w3jVar.b ? qrmVar.q : qrmVar.r);
                            arrayList2.add(qrmVar.h);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (((u3j) obj).g.c == 5) {
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        an2 an2Var = jgk.a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj2 = arrayList.get(i3);
                                i3++;
                                u3j u3jVar = (u3j) obj2;
                                if (u3jVar.g.b.a.containsKey(an2Var) && u3jVar.b().size() != 1) {
                                    if (gyg.G(6, "CXCP")) {
                                        u3jVar.b().size();
                                        break;
                                    }
                                } else if (u3jVar.g.b.a.containsKey(an2Var)) {
                                    int size3 = arrayList.size();
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj3 = arrayList.get(i5);
                                        i5++;
                                        u3j u3jVar2 = (u3j) obj3;
                                        if (((qsm) arrayList3.get(i4)).C() == ssm.f) {
                                            jpo.n("MeteringRepeating should contain a surface", !u3jVar2.b().isEmpty());
                                            linkedHashMap.put(u3jVar2.b().get(0), 1L);
                                        } else if (u3jVar2.g.b.a.containsKey(an2Var) && !u3jVar2.b().isEmpty()) {
                                            linkedHashMap.put(u3jVar2.b().get(0), u3jVar2.g.b.i(an2Var));
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<qrm> collection2 = w3jVar.a;
                        ArrayList arrayList4 = new ArrayList(k95.o(collection2, 10));
                        for (qrm qrmVar2 : collection2) {
                            arrayList4.add(w3jVar.b ? qrmVar2.q : qrmVar2.r);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size4 = arrayList4.size();
                        while (i < size4) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            u3j u3jVar3 = (u3j) obj4;
                            List<g07> listB = u3jVar3.b();
                            ai4 ai4Var = u3jVar3.g;
                            for (g07 g07Var : listB) {
                                wrf wrfVar = ai4Var.b;
                                an2 an2Var2 = eb4.j;
                                if (!wrfVar.a.containsKey(an2Var2) || wrfVar.i(an2Var2) == null) {
                                    linkedHashMap2.put(g07Var, Long.valueOf(Intrinsics.a(g07Var.j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    linkedHashMap2.put(g07Var, wrfVar.i(an2Var2));
                                }
                            }
                        }
                        break;
                    case 2:
                        t3j t3jVar = new t3j();
                        for (qrm qrmVar3 : w3jVar.a) {
                            t3jVar.a(w3jVar.b ? qrmVar3.q : qrmVar3.r);
                        }
                        break;
                    case 3:
                        zyk zykVar = w3jVar.e;
                        if (((t3j) zykVar.getValue()).c()) {
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                    default:
                        zyk zykVar2 = w3jVar.f;
                        if (((t3j) w3jVar.e.getValue()).c()) {
                            po2 po2Var = ((u3j) zykVar2.getValue()).b;
                            if (po2Var != null) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(((u3j) zykVar2.getValue()).b());
                                arrayList5.add(po2Var.a);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            qp2.n("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
    }

    public final void a(g07 g07Var) {
        Object next;
        if (gyg.G(3, "CXCP")) {
            Objects.toString(g07Var);
        }
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qrm qrmVar = (qrm) next;
            if ((this.b ? qrmVar.q : qrmVar.r).b().contains(g07Var)) {
                break;
            }
        }
        qrm qrmVar2 = (qrm) next;
        u3j u3jVar = qrmVar2 != null ? qrmVar2.q : null;
        cv6 cv6Var = bb7.a;
        na2.B(sgb.b(s6d.a.e), null, null, new bz1((byte) 28, (mt5) null, u3jVar), 3);
    }
}
