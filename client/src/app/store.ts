import { Action, configureStore, ThunkAction } from '@reduxjs/toolkit'
import categories from './slices/categories'

export const store = configureStore({
  reducer: {
    categories
  },
})

export type AppDispatch = typeof store.dispatch
export type RootState = ReturnType<typeof store.getState>
export type AppThunk<ReturnType = void> = ThunkAction<
  ReturnType,
  RootState,
  unknown,
  Action<string>
>
