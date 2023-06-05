import { render } from 'react-dom'
import Contact from './Contact'


function App() {
  return <div>
    <h1>Welcome to React!</h1>
    <Contact />
    <Contact />
  </div>
}

render(<App />, document.getElementById('root'));
