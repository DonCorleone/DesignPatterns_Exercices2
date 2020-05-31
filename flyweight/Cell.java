package com.codewithmosh.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellFormat cellFormat;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, cellFormat.getFontFamily());
  }

  public void setCellFormat(CellFormat cellContext) {
    this.cellFormat = cellContext;
  }
  public CellFormat getCellFormat() {
    return cellFormat;
  }
}
