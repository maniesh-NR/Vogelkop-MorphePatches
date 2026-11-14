package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gba {
    public static final Range f = new Range(120, 120);
    public final ge4 a;
    public final zyk b;
    public final zyk c;
    public final zyk d;
    public final zyk e;

    public gba(ge4 ge4Var) {
        this.a = ge4Var;
        final byte b = 0;
        this.b = z4c.b(new Function0(this) { // from class: fba
            public final /* synthetic */ gba b;

            {
                this.b = this;
            }

            public final Object invoke() {
                List listB;
                byte b2 = b;
                gba gbaVar = this.b;
                switch (b2) {
                    case 0:
                        int[] iArr = (int[]) ((ma4) gbaVar.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (iArr[i] == 9) {
                                        z = true;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) gbaVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            t3p.y();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = qpj.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = qpj.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        ge4 ge4Var2 = gbaVar.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) ge4Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new pfk(streamConfigurationMap, new nuf(ge4Var2));
                        }
                        qp2.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((pfk) gbaVar.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listB = e82.B(highSpeedVideoSizes)) == null) ? l08.a : listB;
                }
            }
        });
        final byte b2 = 1;
        this.c = z4c.b(new Function0(this) { // from class: fba
            public final /* synthetic */ gba b;

            {
                this.b = this;
            }

            public final Object invoke() {
                List listB;
                byte b22 = b2;
                gba gbaVar = this.b;
                switch (b22) {
                    case 0:
                        int[] iArr = (int[]) ((ma4) gbaVar.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (iArr[i] == 9) {
                                        z = true;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) gbaVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            t3p.y();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = qpj.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = qpj.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        ge4 ge4Var2 = gbaVar.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) ge4Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new pfk(streamConfigurationMap, new nuf(ge4Var2));
                        }
                        qp2.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((pfk) gbaVar.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listB = e82.B(highSpeedVideoSizes)) == null) ? l08.a : listB;
                }
            }
        });
        final byte b3 = 2;
        this.d = z4c.b(new Function0(this) { // from class: fba
            public final /* synthetic */ gba b;

            {
                this.b = this;
            }

            public final Object invoke() {
                List listB;
                byte b22 = b3;
                gba gbaVar = this.b;
                switch (b22) {
                    case 0:
                        int[] iArr = (int[]) ((ma4) gbaVar.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (iArr[i] == 9) {
                                        z = true;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) gbaVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            t3p.y();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = qpj.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = qpj.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        ge4 ge4Var2 = gbaVar.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) ge4Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new pfk(streamConfigurationMap, new nuf(ge4Var2));
                        }
                        qp2.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((pfk) gbaVar.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listB = e82.B(highSpeedVideoSizes)) == null) ? l08.a : listB;
                }
            }
        });
        final byte b4 = 3;
        this.e = z4c.b(new Function0(this) { // from class: fba
            public final /* synthetic */ gba b;

            {
                this.b = this;
            }

            public final Object invoke() {
                List listB;
                byte b22 = b4;
                gba gbaVar = this.b;
                switch (b22) {
                    case 0:
                        int[] iArr = (int[]) ((ma4) gbaVar.a).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (iArr[i] == 9) {
                                        z = true;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) gbaVar.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            t3p.y();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = qpj.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = qpj.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        ge4 ge4Var2 = gbaVar.a;
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((ma4) ge4Var2).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            return new pfk(streamConfigurationMap, new nuf(ge4Var2));
                        }
                        qp2.o("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((pfk) gbaVar.d.getValue()).c.b;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listB = e82.B(highSpeedVideoSizes)) == null) ? l08.a : listB;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList((Collection) CollectionsKt.K(list));
        Iterator it = CollectionsKt.G(list, 1).iterator();
        while (it.hasNext()) {
            arrayList.retainAll((List) it.next());
        }
        return arrayList;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && CollectionsKt.F(list).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (Intrinsics.a(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [q0i] */
    public final List c(Size size) {
        Range<Integer>[] q0iVar;
        List listK0;
        try {
            p0i p0iVar = t0i.b;
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((pfk) this.d.getValue()).c.b;
            q0iVar = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        Range<Integer>[] rangeArr = q0iVar instanceof q0i ? null : q0iVar;
        return (rangeArr == null || (listK0 = CollectionsKt.k0(e82.p(rangeArr))) == null) ? l08.a : listK0;
    }
}
