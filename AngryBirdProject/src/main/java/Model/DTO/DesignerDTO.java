package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DesignerDTO implements Serializable{
	private String shopsNum;
	private String designerName;
	private String designerField;
	
	public DesignerDTO(String shopsNum, String designerName, String designerField) {
		super();
		this.shopsNum = shopsNum;
		this.designerName = designerName;
		this.designerField = designerField;
	}

	public String getShopsNum() {
		return shopsNum;
	}

	public void setShopsNum(String shopsNum) {
		this.shopsNum = shopsNum;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getDesignerField() {
		return designerField;
	}

	public void setDesignerField(String designerField) {
		this.designerField = designerField;
	}
}
