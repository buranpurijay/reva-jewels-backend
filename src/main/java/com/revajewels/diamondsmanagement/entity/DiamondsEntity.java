package com.revajewels.diamondsmanagement.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "diamonds")
public class DiamondsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Sr")
    private Integer sr;

    @Column(name = "Stone_No")
    private String stoneNo;

    @Column(name = "Lab")
    private String lab;

    @Column(name = "Report_No")
    private Long reportNo;

    @Column(name = "Shape")
    private String shape;

    @Column(name = "Carats", precision = 3, scale = 2)
    private BigDecimal carats;

    @Column(name = "Color")
    private String color;

    @Column(name = "Clarity")
    private String clarity;

    @Column(name = "Cut")
    private String cut;

    @Column(name = "Polish")
    private String polish;

    @Column(name = "Sym")
    private String sym;

    @Column(name = "Flour")
    private String flour;

    @Column(name = "Rap", precision = 5, scale = 2)
    private BigDecimal rap;

    @Column(name = "value", precision = 19, scale = 16)
    private BigDecimal value;

    @Column(name = "Disc", precision = 4, scale = 2)
    private BigDecimal disc;

    @Column(name = "Price_Ct", precision = 19, scale = 16)
    private BigDecimal priceCt;

    @Column(name = "Amount", columnDefinition = "numeric(19,16)")
    private BigDecimal amount;

    @Column(name = "Location")
    private String location;

    @Column(name = "milky")
    private String milky;

    @Column(name = "shade")
    private String shade;

    @Column(name = "Ratio")
    private Integer ratio;

    @Column(name = "Length", precision = 3, scale = 2)
    private BigDecimal length;

    @Column(name = "Width", precision = 3, scale = 2)
    private BigDecimal width;

    @Column(name = "Depth", precision = 3, scale = 2)
    private BigDecimal depth;

    @Column(name = "Table")
    private Integer table;

    @Column(name = "Depth_1", precision = 3, scale = 1)
    private BigDecimal depth1;

    @Column(name = "Crown_Angle", precision = 3, scale = 1)
    private BigDecimal crownAngle;

    @Column(name = "Crown_Height", precision = 4, scale = 2)
    private BigDecimal crownHeight;

    @Column(name = "Pav_Angle", precision = 3, scale = 1)
    private BigDecimal pavAngle;

    @Column(name = "Pav_Height", precision = 4, scale = 2)
    private BigDecimal pavHeight;

    @Column(name = "white_table")
    private String whiteTable;

    @Column(name = "White_Side")
    private String whiteSide;

    @Column(name = "Table_Black")
    private String tableBlack;

    @Column(name = "Side_Black")
    private String sideBlack;

    @Column(name = "Table_Open")
    private String tableOpen;

    @Column(name = "Pav_Open")
    private String pavOpen;

    @Column(name = "Crown_Open")
    private String crownOpen;

    @Column(name = "Girdle", precision = 3, scale = 2)
    private BigDecimal girdle;

    @Column(name = "Girdle_Desc")
    private String girdleDesc;

    @Column(name = "Culet")
    private String culet;

    @Column(name = "Key_To_Symbols")
    private String keyToSymbols;

    @Column(name = "Image_link")
    private Integer imageLink;

    @Column(name = "Image_link_2")
    private Integer imageLink2;

    public DiamondsEntity() {
    }

    public DiamondsEntity(Integer id, Integer sr, String stoneNo, String lab, Long reportNo, String shape, BigDecimal carats, String color, String clarity, String cut, String polish, String sym, String flour, BigDecimal rap, BigDecimal value, BigDecimal disc, BigDecimal priceCt, BigDecimal amount, String location, String milky, String shade, Integer ratio, BigDecimal length, BigDecimal width, BigDecimal depth, Integer table, BigDecimal depth1, BigDecimal crownAngle, BigDecimal crownHeight, BigDecimal pavAngle, BigDecimal pavHeight, String whiteTable, String whiteSide, String tableBlack, String sideBlack, String tableOpen, String pavOpen, String crownOpen, BigDecimal girdle, String girdleDesc, String culet, String keyToSymbols, Integer imageLink, Integer imageLink2) {
        this.id = id;
        this.sr = sr;
        this.stoneNo = stoneNo;
        this.lab = lab;
        this.reportNo = reportNo;
        this.shape = shape;
        this.carats = carats;
        this.color = color;
        this.clarity = clarity;
        this.cut = cut;
        this.polish = polish;
        this.sym = sym;
        this.flour = flour;
        this.rap = rap;
        this.value = value;
        this.disc = disc;
        this.priceCt = priceCt;
        this.amount = amount;
        this.location = location;
        this.milky = milky;
        this.shade = shade;
        this.ratio = ratio;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.table = table;
        this.depth1 = depth1;
        this.crownAngle = crownAngle;
        this.crownHeight = crownHeight;
        this.pavAngle = pavAngle;
        this.pavHeight = pavHeight;
        this.whiteTable = whiteTable;
        this.whiteSide = whiteSide;
        this.tableBlack = tableBlack;
        this.sideBlack = sideBlack;
        this.tableOpen = tableOpen;
        this.pavOpen = pavOpen;
        this.crownOpen = crownOpen;
        this.girdle = girdle;
        this.girdleDesc = girdleDesc;
        this.culet = culet;
        this.keyToSymbols = keyToSymbols;
        this.imageLink = imageLink;
        this.imageLink2 = imageLink2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSr() {
        return sr;
    }

    public void setSr(Integer sr) {
        this.sr = sr;
    }

    public String getStoneNo() {
        return stoneNo;
    }

    public void setStoneNo(String stoneNo) {
        this.stoneNo = stoneNo;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public Long getReportNo() {
        return reportNo;
    }

    public void setReportNo(Long reportNo) {
        this.reportNo = reportNo;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public BigDecimal getCarats() {
        return carats;
    }

    public void setCarats(BigDecimal carats) {
        this.carats = carats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public BigDecimal getRap() {
        return rap;
    }

    public void setRap(BigDecimal rap) {
        this.rap = rap;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getDisc() {
        return disc;
    }

    public void setDisc(BigDecimal disc) {
        this.disc = disc;
    }

    public BigDecimal getPriceCt() {
        return priceCt;
    }

    public void setPriceCt(BigDecimal priceCt) {
        this.priceCt = priceCt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMilky() {
        return milky;
    }

    public void setMilky(String milky) {
        this.milky = milky;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public Integer getTable() {
        return table;
    }

    public void setTable(Integer table) {
        this.table = table;
    }

    public BigDecimal getDepth1() {
        return depth1;
    }

    public void setDepth1(BigDecimal depth1) {
        this.depth1 = depth1;
    }

    public BigDecimal getCrownAngle() {
        return crownAngle;
    }

    public void setCrownAngle(BigDecimal crownAngle) {
        this.crownAngle = crownAngle;
    }

    public BigDecimal getCrownHeight() {
        return crownHeight;
    }

    public void setCrownHeight(BigDecimal crownHeight) {
        this.crownHeight = crownHeight;
    }

    public BigDecimal getPavAngle() {
        return pavAngle;
    }

    public void setPavAngle(BigDecimal pavAngle) {
        this.pavAngle = pavAngle;
    }

    public BigDecimal getPavHeight() {
        return pavHeight;
    }

    public void setPavHeight(BigDecimal pavHeight) {
        this.pavHeight = pavHeight;
    }

    public String getWhiteTable() {
        return whiteTable;
    }

    public void setWhiteTable(String whiteTable) {
        this.whiteTable = whiteTable;
    }

    public String getWhiteSide() {
        return whiteSide;
    }

    public void setWhiteSide(String whiteSide) {
        this.whiteSide = whiteSide;
    }

    public String getTableBlack() {
        return tableBlack;
    }

    public void setTableBlack(String tableBlack) {
        this.tableBlack = tableBlack;
    }

    public String getSideBlack() {
        return sideBlack;
    }

    public void setSideBlack(String sideBlack) {
        this.sideBlack = sideBlack;
    }

    public String getTableOpen() {
        return tableOpen;
    }

    public void setTableOpen(String tableOpen) {
        this.tableOpen = tableOpen;
    }

    public String getPavOpen() {
        return pavOpen;
    }

    public void setPavOpen(String pavOpen) {
        this.pavOpen = pavOpen;
    }

    public String getCrownOpen() {
        return crownOpen;
    }

    public void setCrownOpen(String crownOpen) {
        this.crownOpen = crownOpen;
    }

    public BigDecimal getGirdle() {
        return girdle;
    }

    public void setGirdle(BigDecimal girdle) {
        this.girdle = girdle;
    }

    public String getGirdleDesc() {
        return girdleDesc;
    }

    public void setGirdleDesc(String girdleDesc) {
        this.girdleDesc = girdleDesc;
    }

    public String getCulet() {
        return culet;
    }

    public void setCulet(String culet) {
        this.culet = culet;
    }

    public String getKeyToSymbols() {
        return keyToSymbols;
    }

    public void setKeyToSymbols(String keyToSymbols) {
        this.keyToSymbols = keyToSymbols;
    }

    public Integer getImageLink() {
        return imageLink;
    }

    public void setImageLink(Integer imageLink) {
        this.imageLink = imageLink;
    }

    public Integer getImageLink2() {
        return imageLink2;
    }

    public void setImageLink2(Integer imageLink2) {
        this.imageLink2 = imageLink2;
    }
}
