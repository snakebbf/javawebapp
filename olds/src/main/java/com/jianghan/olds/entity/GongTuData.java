package com.jianghan.olds.entity;

import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlRootElement;

//ID,sgt,jh,csrq,cssj,gtxh,cc,cc1,zdzh,zxzh,llzdzh,llzxzh,jsjg,jsr,fxs,lxs,axs,csr,
//shr,bj,bz,km,dm,ny,bxh,yqmc,yqxh,yqbh,yy,rcyl1,hs,rcql,sxdl,xxdl,gtlb,gtjcb,lsl,
//jsdm,kztsx,fcj,csdw,gtds,xdzdzh,xdzxzh, yzz,gzz,sccc,sccc1,llpl, bs,bx,cmd,
//cyggg1,cygcd1,cyggg2,cyggg2,cyggg3,cyggg3,cyggg4,cygcd4,
//fcbz, shbz,wgrq,  dym,zdllzh,zxllzh,jx, gtshbz ,bhgsm,gtgif

@XmlRootElement(name="GongTuData")
public class GongTuData {
	private Integer ID;
	private String  sgt;//此数据显示功图的首尾相连24个坐标,需要转化为相应的int[25][2]
	private float[][] sgtData;
	
	public void createSgtData(){
		
		StringTokenizer sgt  = new StringTokenizer(this.sgt);
		int numSize = sgt.countTokens();
		int dataSize = numSize/2;
		sgtData = new float[dataSize+1][2];
		
		for(int i=0;i<dataSize;i++){
			//依次读取点
			float yData = new Float(sgt.nextToken());
			float xData = new Float(sgt.nextToken());
			sgtData[i][0] = xData;
			sgtData[i][1] = yData;
		}
		//设置最后一个点和第一个点相同
		sgtData[dataSize][0] = sgtData[0][0];
		sgtData[dataSize][1] = sgtData[0][1];
	}
	private String  jh;//丼号
	private String  csrq;//
	private String  cssj;	
	private Integer  gtxh;
	private Float  cc;
	private Float  cc1;//
	private Float  zdzh;//
	private Float  zxzh;
	private Float  llzdzh;
	private Float llzxzh;
	private String  jsjg;
	private String  jsr;
	private String  fxs;
	private String  lxs;
	private String  axs;
	private String  csr;
	private String  shr;
	private String  bj;
	private Float  ty;
	private String  bz;
	private String  km;
	private String  dm;
	private String  ny;
	private String  bxh;
	private String  yqmc;
	private String  yqxh;
	private String  yqbh;
	private Float  yy;
	private Float  rcyl1;
	private Float  hs;
	private Float rcql;
	private Float  sxdl;
	private  Float  xxdl;
	private  Float   gtlb;
	private Float  gtjcb;
	private Float  lsl;
	private String  jsdm;
	private String  kztsx;
	private  Float  fcj;
	private String  csdw;
	private Integer  gtds;
	private Float  xdzdzh;
	private Float   xdzxzh;//xdzxzh, yzz,gzz,sccc,sccc1,llpl, bs,bx,cmd
	private Float   yzz;
	private Float   gzz;
	private Float   sccc;
	private Float   sccc1;
	private Float   llpl;
	private Float   bs;
	private Float   bx;
	private Float   cmd;
	private String  cyggg1; //cyggg1,cygcd1,cyggg2,cyggg2,cyggg3,cyggg3,cyggg4,cygcd4
	private Float   cygcd1;
	private String  cyggg2;
	private Float   cygcd2;
	private String  cyggg3;
	private Float   cygcd3;
	private String  cyggg4;
	private Float   cygcd4;
	private Integer  fcbz;//fcbz, shbz,wgrq,  dym,zdllzh,zxllzh,jx, gtshbz ,bhgsm,gtgif
	private  Integer  shbz;
	private String  wgrq;//时间
	private Float  dym;
	private Float  zdllzh;
	private Float  zxllzh;
	private String  jx;
	private Float   gtshbz;
	private String  bhgsm;
	private String   gtgif;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getSgt() {
		return sgt;
	}
	public void setSgt(String sgt) {
		this.sgt = sgt;
	}
	public String getJh() {
		return jh;
	}
	public void setJh(String jh) {
		this.jh = jh;
	}
	public String getCsrq() {
		return csrq;
	}
	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}
	public String getCssj() {
		return cssj;
	}
	public void setCssj(String cssj) {
		this.cssj = cssj;
	}
	public Integer getGtxh() {
		return gtxh;
	}
	public void setGtxh(Integer gtxh) {
		this.gtxh = gtxh;
	}
	public Float getCc() {
		return cc;
	}
	public void setCc(Float cc) {
		this.cc = cc;
	}
	public Float getCc1() {
		return cc1;
	}
	public void setCc1(Float cc1) {
		this.cc1 = cc1;
	}
	public Float getZdzh() {
		return zdzh;
	}
	public void setZdzh(Float zdzh) {
		this.zdzh = zdzh;
	}
	public Float getZxzh() {
		return zxzh;
	}
	public void setZxzh(Float zxzh) {
		this.zxzh = zxzh;
	}
	public Float getLlzdzh() {
		return llzdzh;
	}
	public void setLlzdzh(Float llzdzh) {
		this.llzdzh = llzdzh;
	}
	public Float getLlzxzh() {
		return llzxzh;
	}
	public void setLlzxzh(Float llzxzh) {
		this.llzxzh = llzxzh;
	}
	public String getJsjg() {
		return jsjg;
	}
	public void setJsjg(String jsjg) {
		this.jsjg = jsjg;
	}
	public String getJsr() {
		return jsr;
	}
	public void setJsr(String jsr) {
		this.jsr = jsr;
	}
	public String getFxs() {
		return fxs;
	}
	public void setFxs(String fxs) {
		this.fxs = fxs;
	}
	public String getLxs() {
		return lxs;
	}
	public void setLxs(String lxs) {
		this.lxs = lxs;
	}
	public String getAxs() {
		return axs;
	}
	public void setAxs(String axs) {
		this.axs = axs;
	}
	public String getCsr() {
		return csr;
	}
	public void setCsr(String csr) {
		this.csr = csr;
	}
	public String getShr() {
		return shr;
	}
	public void setShr(String shr) {
		this.shr = shr;
	}
	public String getBj() {
		return bj;
	}
	public void setBj(String bj) {
		this.bj = bj;
	}
	public Float getTy() {
		return ty;
	}
	public void setTy(Float ty) {
		this.ty = ty;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getDm() {
		return dm;
	}
	public void setDm(String dm) {
		this.dm = dm;
	}
	public String getNy() {
		return ny;
	}
	public void setNy(String ny) {
		this.ny = ny;
	}
	public String getBxh() {
		return bxh;
	}
	public void setBxh(String bxh) {
		this.bxh = bxh;
	}
	public String getYqmc() {
		return yqmc;
	}
	public void setYqmc(String yqmc) {
		this.yqmc = yqmc;
	}
	public String getYqxh() {
		return yqxh;
	}
	public void setYqxh(String yqxh) {
		this.yqxh = yqxh;
	}
	public String getYqbh() {
		return yqbh;
	}
	public void setYqbh(String yqbh) {
		this.yqbh = yqbh;
	}
	public Float getYy() {
		return yy;
	}
	public void setYy(Float yy) {
		this.yy = yy;
	}
	public Float getRcyl1() {
		return rcyl1;
	}
	public void setRcyl1(Float rcyl1) {
		this.rcyl1 = rcyl1;
	}
	public Float getHs() {
		return hs;
	}
	public void setHs(Float hs) {
		this.hs = hs;
	}
	public Float getRcql() {
		return rcql;
	}
	public void setRcql(Float rcql) {
		this.rcql = rcql;
	}
	public Float getSxdl() {
		return sxdl;
	}
	public void setSxdl(Float sxdl) {
		this.sxdl = sxdl;
	}
	public Float getXxdl() {
		return xxdl;
	}
	public void setXxdl(Float xxdl) {
		this.xxdl = xxdl;
	}
	public Float getGtlb() {
		return gtlb;
	}
	public void setGtlb(Float gtlb) {
		this.gtlb = gtlb;
	}
	public Float getGtjcb() {
		return gtjcb;
	}
	public void setGtjcb(Float gtjcb) {
		this.gtjcb = gtjcb;
	}
	public Float getLsl() {
		return lsl;
	}
	public void setLsl(Float lsl) {
		this.lsl = lsl;
	}
	public String getJsdm() {
		return jsdm;
	}
	public void setJsdm(String jsdm) {
		this.jsdm = jsdm;
	}
	public String getKztsx() {
		return kztsx;
	}
	public void setKztsx(String kztsx) {
		this.kztsx = kztsx;
	}
	public Float getFcj() {
		return fcj;
	}
	public void setFcj(Float fcj) {
		this.fcj = fcj;
	}
	public String getCsdw() {
		return csdw;
	}
	public void setCsdw(String csdw) {
		this.csdw = csdw;
	}
	public Integer getGtds() {
		return gtds;
	}
	public void setGtds(Integer gtds) {
		this.gtds = gtds;
	}
	public Float getXdzdzh() {
		return xdzdzh;
	}
	public void setXdzdzh(Float xdzdzh) {
		this.xdzdzh = xdzdzh;
	}
	public Float getXdzxzh() {
		return xdzxzh;
	}
	public void setXdzxzh(Float xdzxzh) {
		this.xdzxzh = xdzxzh;
	}
	public Float getYzz() {
		return yzz;
	}
	public void setYzz(Float yzz) {
		this.yzz = yzz;
	}
	public Float getGzz() {
		return gzz;
	}
	public void setGzz(Float gzz) {
		this.gzz = gzz;
	}
	public Float getSccc() {
		return sccc;
	}
	public void setSccc(Float sccc) {
		this.sccc = sccc;
	}
	public Float getSccc1() {
		return sccc1;
	}
	public void setSccc1(Float sccc1) {
		this.sccc1 = sccc1;
	}
	public Float getLlpl() {
		return llpl;
	}
	public void setLlpl(Float llpl) {
		this.llpl = llpl;
	}
	public Float getBs() {
		return bs;
	}
	public void setBs(Float bs) {
		this.bs = bs;
	}
	public Float getBx() {
		return bx;
	}
	public void setBx(Float bx) {
		this.bx = bx;
	}
	public Float getCmd() {
		return cmd;
	}
	public void setCmd(Float cmd) {
		this.cmd = cmd;
	}
	public String getCyggg1() {
		return cyggg1;
	}
	public void setCyggg1(String cyggg1) {
		this.cyggg1 = cyggg1;
	}
	public Float getCygcd1() {
		return cygcd1;
	}
	public void setCygcd1(Float cygcd1) {
		this.cygcd1 = cygcd1;
	}
	public String getCyggg2() {
		return cyggg2;
	}
	public void setCyggg2(String cyggg2) {
		this.cyggg2 = cyggg2;
	}
	public Float getCygcd2() {
		return cygcd2;
	}
	public void setCygcd2(Float cygcd2) {
		this.cygcd2 = cygcd2;
	}
	public String getCyggg3() {
		return cyggg3;
	}
	public void setCyggg3(String cyggg3) {
		this.cyggg3 = cyggg3;
	}
	public Float getCygcd3() {
		return cygcd3;
	}
	public void setCygcd3(Float cygcd3) {
		this.cygcd3 = cygcd3;
	}
	public String getCyggg4() {
		return cyggg4;
	}
	public void setCyggg4(String cyggg4) {
		this.cyggg4 = cyggg4;
	}
	public Float getCygcd4() {
		return cygcd4;
	}
	public void setCygcd4(Float cygcd4) {
		this.cygcd4 = cygcd4;
	}
	public Integer getFcbz() {
		return fcbz;
	}
	public void setFcbz(Integer fcbz) {
		this.fcbz = fcbz;
	}
	public Integer getShbz() {
		return shbz;
	}
	public void setShbz(Integer shbz) {
		this.shbz = shbz;
	}
	public String getWgrq() {
		return wgrq;
	}
	public void setWgrq(String wgrq) {
		this.wgrq = wgrq;
	}
	public Float getDym() {
		return dym;
	}
	public void setDym(Float dym) {
		this.dym = dym;
	}
	public Float getZdllzh() {
		return zdllzh;
	}
	public void setZdllzh(Float zdllzh) {
		this.zdllzh = zdllzh;
	}
	public Float getZxllzh() {
		return zxllzh;
	}
	public void setZxllzh(Float zxllzh) {
		this.zxllzh = zxllzh;
	}
	public String getJx() {
		return jx;
	}
	public void setJx(String jx) {
		this.jx = jx;
	}
	public Float getGtshbz() {
		return gtshbz;
	}
	public void setGtshbz(Float gtshbz) {
		this.gtshbz = gtshbz;
	}
	public String getBhgsm() {
		return bhgsm;
	}
	public void setBhgsm(String bhgsm) {
		this.bhgsm = bhgsm;
	}
	public String getGtgif() {
		return gtgif;
	}
	public void setGtgif(String gtgif) {
		this.gtgif = gtgif;
	}
	public float[][] getSgtData() {
		return sgtData;
	}
	public void setSgtData(float[][] sgtData) {
		this.sgtData = sgtData;
	}
	

	
}
