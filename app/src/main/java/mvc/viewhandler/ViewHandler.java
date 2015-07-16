package mvc.viewhandler;

import android.view.View;
import android.view.View.OnClickListener;

import mvc.IDataAdapter;
import mvc.ILoadViewFactory;
import mvc.MVCHelper;

public interface ViewHandler {

	/**
	 *
	 * @param contentView
	 * @param adapter
	 * @param loadMoreView
	 * @param onClickLoadMoreListener
	 * @return 是否有 init ILoadMoreView
	 */
	public boolean handleSetAdapter(View contentView, IDataAdapter<?> adapter, ILoadViewFactory.ILoadMoreView loadMoreView, OnClickListener onClickLoadMoreListener);

	public void setOnScrollBottomListener(View contentView, MVCHelper.OnScrollBottomListener onScrollBottomListener);

}
