package com.hy.commons.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import magick.MagickException;

import com.hy.commons.result.Result;


/**
 * 图片储存 
 * ImageMagick
 * 
 * <li>商品中图（详细页显示）：350*350 像素</li>
 * 
 * <li>中图下面的5个小图（详细页显示）：45*45 像素</li>
 * 
 * <li>列表页图片（列表形式）：100*100 像素</li>
 * 
 * <li>列表页图片（大图形式）：220*220 像素</li>
 * 
 * <li>商品大图显示：500*500 像素</li>
 * 
 * @author LiChunming
 * @version $Id: DefaultImageManager.java 创建时间：2009-9-4 LiRiGuang Exp $
 * 
 */
public interface ImageManager {
	/**
	 * @param file
	 * file为文件上传后的在服务端的临时文件,struts2适用
	 */
	public Result writeImage(File file) throws IOException;

	/**
	 * 判断文件是否符合规矩 <br>
	 * 图片的格式为:gif,jpg,png
	 * @param file
	 * @return
	 */
	public boolean checkImageTypeVailable(File file);

	/**
	 * 上传图片，该方法不对图片进行压缩
	 * 
	 * @param file
	 * @return
	 */
	public Result UploadImage(File file) throws IOException;
	/**
	 * 上传图片,用户自定义长及宽
	 * @param imgHeight 
	 * @param imgWidth
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public Result UploadResizeImage(int imgHeight,int imgWidth,File file) throws IOException;
	/** 
	*  @Description: 
	*   上传图片，用户自定义长及宽
	*   @param sizeList 格式为： 500*500，100*200
	*   @param file 文件对象
	*   @return
	*   @throws IOException    设定文件 
	*  @return Result    返回类型 
	*/
	public Result UploadResizeImageList(List<String> sizeList,File file) throws IOException;

	/**
	 * 组合图片名称 例如：根据A.jpg 获得小图 A.100x100.jpg
	 */
	public String imageCombine(String size, String imageName) throws Exception;

	/**
	 * 找到图片物理地址进行删除
	 * 
	 * @param imageurl 为图片的物理地址
	 */
	public void deleteFile(String imageurl);

	/**
	 * 删除图片文件
	 * 
	 * 改方法适用于商品图片
	 */
	public boolean delPhysicalImage(List<String> listdel, int sellerId);

	/**
	 * 检查文件大小
	 * 
	 * @param file
	 * @return
	 */
	public boolean checkFileSize(File file);
	
	/**
	 * 创建图片
	 * @param imageurl 图片的URL
	 * @return
	 */
	public Result createImage(String imageurl);
	/**
	 * 获取图片类型
	 * @param file 图片
	 * @return
	 */
	public String getImageType(File file);
}
