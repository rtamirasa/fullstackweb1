
import {BrowserRouter, Navigate, Routes, Route} from 'react-router-dom';
import HomePage from 'scenes/homePage';
import loginPage from 'scenes/loginPage';
import profilePage from 'scenes/profilePage';
import { CssBaseline, ThemeProvider } from '@mui/material';
import { createTheme } from '@mui/material';
import { themeSettings } from 'theme';
import { Css } from '@mui/icons-material';


function App() {
  const mode = useSelector((state) => state.mode);
  const theme = useMemo(() =>createTheme(themeSettingsmode), [mode]);
  return (
    <div className="app">

      <BrowserRouter>
      <ThemeProvider theme = {theme}>
        <CssBaseline/>
      <Routes>
        <Route path = "/" element = {<LoginPage/>} />
      <Route path = "/home" element = {<HomePage/>} />
      <Route path = "/profile/:userId" element = {<ProfilePage/>} />
      </Routes>
      </ThemeProvider>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
